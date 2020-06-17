//package com.xn.test;
//
//import java.util.*;
//
///**
// * Created by Administrator on 2018/2/26.
// */
//public class Lambda {
//    public static void main(String[] args) {
//        Map<String,String> map=new HashMap<>();
//        map.put("zhangsan","123");
//        map.put("lisi","345");
//        map.forEach((k,v)->{
//            System.out.println(k+v);
//        });
//        List<String> list=new ArrayList<>();
//        list.add("1");
//        list.add("4");
//        list.add("3");
//        Collections.sort(list,(a,b)->a.compareTo(b));
//        list.forEach(s -> System.out.println(s));
//    }
//}
