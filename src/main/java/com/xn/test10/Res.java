package com.xn.test10;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xn.tianrun.JsonUtils;

public class Res {
    public static void main(String[] args) {
      String s="{\\\\\\\"playObject\\\\\\\":[\\\\\\\"7000167/1554101334632=喂，您好这里是天天买车，与汽车之家合作的买车平台，请问您有车要卖吗？\\\\\\\",\\\\\\\"7000167/1554101359212=我们这边是天天拍车，请问您在平台上注册的那辆车还打算卖吗？\\\\\\\"],\\\\\\\"playInterrupt\\\\\\\":false,\\\\\\\"playType\\\\\\\":\\\\\\\"voice\\\\\\\"}";

      ObjectMapper mapper=new ObjectMapper();
      JsonNode jsonNode = JsonUtils.readJsonNode(s);
      System.out.println(jsonNode.asText());
    }
}
