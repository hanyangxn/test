package com.xn.test10;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/8/22.
 */
public class LinShi {
    public static void main(String[] args) throws Exception{
        List<String> list = new ArrayList<>();
        list.add("你好");
        list.add("哈哈");
        list.add("思思");
        File file = ResourceUtils.getFile("classpath:unit/unit.txt");
        FileWriter fw = new FileWriter(file);
        if(list !=null&&list.size()!=0){
            for(int i=0;i<list.size();i++){
                fw.write(list.get(i));
                if(i!=list.size()-1){
                    fw.write("\r\n");
                }
            }
        }
        fw.close();
        uploadFile(file);
    }
    /***
     * 上传文件
     * @param file
     * @return
     */
    private static BaiDuResponseData uploadFile(File file) {
        String url = "https://aip.baidubce.com/file/2.0/unit/file/upload?access_token=24.321fae50d8868d542fae8cd71237010b.2592000.1537516390.282335-11571155";
        BaiDuResponseData baiDuResponseData =null;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpPost httppost = new HttpPost(url);
            RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(10000).setSocketTimeout(10000).build();
            httppost.setConfig(requestConfig);
            FileBody bin = new FileBody(file);
            StringBody comment = new StringBody("This is comment", ContentType.TEXT_PLAIN);
            HttpEntity reqEntity = MultipartEntityBuilder.create().addPart("file", bin).addPart("comment", comment).build();
            httppost.setEntity(reqEntity);
            System.out.println("executing request " + httppost.getRequestLine());
            CloseableHttpResponse response = httpclient.execute(httppost);
            try {
                System.out.println(response.getStatusLine());
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    baiDuResponseData = JSONObject.parseObject(EntityUtils.toString(response.getEntity()),BaiDuResponseData.class);
                    System.out.println(baiDuResponseData);
                }
                EntityUtils.consume(resEntity);
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return baiDuResponseData;
    }
}
