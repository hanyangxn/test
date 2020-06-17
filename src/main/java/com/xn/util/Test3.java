package com.xn.util;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/9/14.
 */
public class Test3 {
    public static void main(String[] args) {


        String[] q = {"c2d24e38-ade4-11e8-addb-0a580af40378","69a30692-aec2-11e8-addb-0a580af40378","a0c606bf-b721-11e8-addb-0a580af40378"};
        List<String> list = Arrays.asList(q);
        List<String> knowledgeIdList= new ArrayList(list);
        knowledgeIdList.remove("c2d24e38-ade4-11e8-addb-0a580af40378");

        knowledgeIdList.forEach(s-> System.out.println(s));
//        String s="ss;ss;s;s;se;";
//        System.out.println(s.substring(0,s.length()-1));
//        Map<String,String> robitMap = new HashMap();
//        robitMap.put("1", "4");
//        List<Map.Entry<String,String>> mapList=new ArrayList<>(robitMap.entrySet());
//        List<Map.Entry<String, String>> noTrain = mapList.stream().filter(s ->!"3".equals(s.getValue())).collect(Collectors.toList());
//        System.out.println(noTrain);
    }
}
