//package com.xn.test;
//
//import java.util.*;
//
///**
// * Created by Administrator on 2018/2/27.
// */
//public class PaiXu {
//    public static void main(String[] args) {
////        int[] arr={1,2,3,4,5,6,6,65,56,55,5,5,5,5,77,8,8,90,89,9,1,1,1,2,1,2,2,2,2};
////        Arrays.sort(arr);
////        System.out.println(Arrays.toString(arr));
////        int a=0;
////        int b=arr[0];
////        Map<Integer,Integer> map=new HashMap<>();
////        for (int i = 0; i < arr.length; i++) {
////            if (b!=arr[i]){
////                b=arr[i];
////                a=1;
////            }else {
////                a++;
////            }
////            map.put(b,a);
////        }
////        List<Map.Entry<Integer,Integer>> list=new LinkedList<>(map.entrySet());
////        Collections.sort(list,(c,d)->c.getValue().compareTo(d.getValue()));
////        for (Map.Entry<Integer,Integer> newmap: list) {
////            System.out.println(newmap.getKey()+"cishi"+newmap.getValue());
////        }
//        String returnContents="彩票名称为:#@lottery_name@#,彩票类型为:#@lottery_type_id@#,开奖日期为:#@remarks@#";
//        String json="{\n" +
//                "    \"reason\": \"查询成功\",\n" +
//                "    \"result\": [\n" +
//                "        {\n" +
//                "            \"lottery_id\": \"ssq\",\n" +
//                "            \"lottery_name\": \"双色球\",\n" +
//                "            \"lottery_type_id\": \"1\",\n" +
//                "            \"remarks\": \"每周二、四、日开奖\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"lottery_id\": \"dlt\",\n" +
//                "            \"lottery_name\": \"超级大乐透\",\n" +
//                "            \"lottery_type_id\": \"2\",\n" +
//                "            \"remarks\": \"每周一、三、六开奖\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"lottery_id\": \"qlc\",\n" +
//                "            \"lottery_name\": \"七乐彩\",\n" +
//                "            \"lottery_type_id\": \"1\",\n" +
//                "            \"remarks\": \"每周一、三、五开奖\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"lottery_id\": \"fcsd\",\n" +
//                "            \"lottery_name\": \"福彩3D\",\n" +
//                "            \"lottery_type_id\": \"1\",\n" +
//                "            \"remarks\": \"每日开奖\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"lottery_id\": \"qxc\",\n" +
//                "            \"lottery_name\": \"七星彩\",\n" +
//                "            \"lottery_type_id\": \"2\",\n" +
//                "            \"remarks\": \"每周二、五、日开奖\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"lottery_id\": \"pls\",\n" +
//                "            \"lottery_name\": \"排列3\",\n" +
//                "            \"lottery_type_id\": \"2\",\n" +
//                "            \"remarks\": \"每日开奖\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"lottery_id\": \"plw\",\n" +
//                "            \"lottery_name\": \"排列5\",\n" +
//                "            \"lottery_type_id\": \"2\",\n" +
//                "            \"remarks\": \"每日开奖\"\n" +
//                "        }\n" +
//                "    ],\n" +
//                "    \"error_code\": 0\n" +
//                "}";
//        List<String> returnContentList = Arrays.asList(returnContents.split("@#"));
//        returnContentList.forEach(s-> System.out.println(s));
//        String resultAll = "";
//        for (String str : returnContentList) {
//            String result = "";
//            if (str.contains("#@")) {
//                //获取配置的回复内容
//                String tempStr = str.substring(str.indexOf("#@") + 2);
//                String sub = json.substring(json.indexOf(tempStr));
//                System.out.println("sub+"+sub);
////                result = sub.substring(sub.indexOf(":") + 2, sub.indexOf(",")).substring(0, sub.indexOf("\"")).replaceAll("\"", "").trim();
//                result = sub.substring(sub.indexOf(":") + 1, sub.indexOf(","));
//                result= result.substring(0,result.lastIndexOf("\"")).trim().replaceAll("\"", "").trim();
//            } else {
//                result = str;
//            }
//            result=str.substring(0,str.indexOf("#@"))+result;
//            resultAll += result;
//        }
//        System.out.println(resultAll);
//    }
//}
