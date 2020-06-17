package com.xn.tianrun;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.ObjectUtils;

import java.io.IOException;

/**
 * ClassFor:
 * jsonUtils
 *
 * @author: Tinet_yinzk
 * @data: 18-9-6 上午11:47
 */
public class JsonUtils {


    private static ObjectMapper mapper = new ObjectMapper();


    public static String toJson(Object obj) {

        if (ObjectUtils.isEmpty(obj)) {
            return "";
        }

        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return "";
    }


    public static <T> T readValue(String jsonStr, TypeReference<T> valueTypeRef) {

        if (ObjectUtils.isEmpty(jsonStr)) {
            return null;
        }

        try {
            return mapper.readValue(jsonStr, valueTypeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static <T> T readValue(String jsonStr, Class<T> valueType) {

        if (ObjectUtils.isEmpty(jsonStr)) {
            return null;
        }

        try {
            //解决 json中存在 反序列化对象中不存在的字段，反序列化报错的问题。
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            //配合 @JsonIgnoreProperties(ignoreUnknown = true) 一同解决 反序列化对象中存在json中不存在的字段，导致反序列化报错的问题。
            return mapper.readValue(jsonStr, valueType);
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("json 解析错误：" + jsonStr + ",error_msg:" + e.getMessage());
        }

        return null;
    }


    /**
     * json字符串转JsonNode
     *
     * @param jsonStr json字符串
     * @return
     */
    public static JsonNode readJsonNode(String jsonStr) {

        if (ObjectUtils.isEmpty(jsonStr)) {
            return null;
        }

        JsonNode paramNode = null;
        try {
            paramNode = mapper.readTree(jsonStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return paramNode;

    }


}
