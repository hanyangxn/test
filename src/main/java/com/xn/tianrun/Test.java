package com.xn.tianrun;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Test {

        private final Map<String, String> parameters = new TreeMap<>();

        @Autowired
        private CloseableHttpClient httpClient;

        /**
         * 发送post请求，加密算法(get注释里会展示)
         */
//        @Test
        public void sign() {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            String accessKeyId="your accessKeyId";
            String accessKeySecret = "your accessKeySecret";
            Integer expires = 5;  //时间随意设置
            String timestamp = sdf.format(new Date()); //签名时间戳
            String signature =null; // 计算签名
            String url = "smartlink-asr-test.tinetcloud.com/asr/task"; // 需要访问的接口,

            //把每个参数做一下urlecode,并插入treemap,treemap有序的
            putParameter("AccessKeyId",accessKeyId);
            putParameter("Expires",expires);
            putParameter("Timestamp",timestamp);

            //拼接参数urlParam 如（1）中 ，例如“POSTsmartlink-asr-test.tinetcloud.com/asr/task?accessKeyId=.......”
            //当请求示GET 时，需要将参数也拼接上。如（1）中，例如“GETsmartlink-asr-test.tinetcloud.com/asr/task?accessKeyId=***&fileUrl=....”

            String urlParam = "POSTsmartlink-asr-test.tinetcloud.com/asr/task"+"?"+getUrlParam(parameters);
            //加密
            signature =hmac(accessKeySecret, urlParam);
            //将计算签名做URLEncoder
            putParameter("Signature",signature);
            //拼接post最终的请求地址
            String postUrl = "http://"+url +"?" + getUrlParam(parameters);

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("fileUrl","*****");
            jsonObject.put("fileName","****");
            HttpPost httpPost = new HttpPost(postUrl);
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(2000).setConnectTimeout(2000).build();
            httpPost.setConfig(requestConfig);
            httpPost.setHeader("Content-type","application/json");
            // 构建消息实体
            httpPost.setEntity(new StringEntity(jsonObject.toJSONString(), "UTF-8"));
            try {
                CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
                HttpEntity responseEntity = httpResponse.getEntity();
                String result = EntityUtils.toString(responseEntity, "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        /**
         * 加密算法
         * @param accessKeySecret
         * @param urlParam
         * @return
         */
        private String hmac(String accessKeySecret, String urlParam) {
            try {
                Mac mac = Mac.getInstance("HmacSHA1");
                mac.init(new SecretKeySpec(accessKeySecret.getBytes("UTF-8"), "HmacSHA1"));
                byte[] signData = mac.doFinal(urlParam.getBytes("UTF-8"));
                return DatatypeConverter.printBase64Binary(signData);
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalArgumentException(e.toString());
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(e.toString());
            } catch (InvalidKeyException e) {
                throw new IllegalArgumentException(e.toString());
            }
        }

        /**
         * 将排序好也做好URLEncoder的参数拼接
         * @param parameters
         * @return
         */
        private String getUrlParam(Map<String, String> parameters) {

            TreeMap<String, String> sortedParameters = new TreeMap<String, String>(parameters);
            StringBuilder sortedParameterString = new StringBuilder();

            //拼接urlparam字符串
            for(String key : sortedParameters.keySet()) {
                sortedParameterString.append(key)
                        .append("=")
                        .append(sortedParameters.get(key))
                        .append("&");
            }
            if (sortedParameterString.length() != 0 ) {
                sortedParameterString = new StringBuilder(sortedParameterString.substring(0, sortedParameterString.length() - 1));
            }

            return sortedParameterString.toString();
        }

        /**
         * 添加参数之前，键值对都需要做URLEncoder
         * @param key
         * @param value
         */
        private void putParameter(String key,Object value) {
            try {
                String encodedKey = URLEncoder.encode(key, "UTF-8");
                String encodedValue = URLEncoder.encode(String.valueOf(value), "UTF-8");
                parameters.put(encodedKey, encodedValue);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
}
