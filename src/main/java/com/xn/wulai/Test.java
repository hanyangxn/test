package com.xn.wulai;

import com.fasterxml.jackson.databind.JsonNode;
import com.xn.tianrun.JsonUtils;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class Test {
//        String s="{\"task\":{\"entities\":[{\"name\":\"task_id\",\"value\":\"6099\",\"seg_value\":\"6099\",\"idx_start\":0,\"idx_end\":0,\"desc\":\"\",\"type\":\"ENTITY_TYPE_SYS\"},{\"name\":\"app_id\",\"value\":\"557\",\"seg_value\":\"557\",\"idx_start\":0,\"idx_end\":0,\"desc\":\"\",\"type\":\"ENTITY_TYPE_SYS\"}],\"robot_id\":1407,\"task_id\":6099,\"task_name\":\"主流程\",\"block_id\":43084,\"block_name\":\"开场白\",\"block_type\":\"BLOCK_TYPE_ASK\"}}";
//        JsonNode botReplay = JsonUtils.readJsonNode(s);
//        String block_name = botReplay.get("task").get("block_name").asText();
//        System.out.println("task========="+ block_name);
//        String str= JsonUtils.readJsonNode(botReplay.get("task").asText()).get("block_name").asText();

        public static void switchTest(int a){
            switch(a){
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(3);
                    break;

            }
        }
        public static void main(String[] args) {
//            Test.switchTest(5);
            List list=null;
            if (!CollectionUtils.isEmpty(list)) {
                System.out.println("sdf");
            }
        }

}
