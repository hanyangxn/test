//package com.xn.controller;
//
//import java.util.*;
//
///**
// * Created by Administrator on 2018/1/10.
// */
//public class JiHe {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("4");
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        System.out.println("size---------------------->"+list.size());
//        Collections.sort(list,(a,b)->b.compareTo(a));
//
//        Optional<String> reduce = list.stream().sorted().reduce((a, b) -> a + "#" + b);
//        reduce.ifPresent(s -> System.out.println(s));
//        //list.stream().map(String::toLowerCase).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
//        /*long count = list.stream().filter(s -> s.startsWith("2")).count();
//        System.out.println(count);*/
//        /*list.stream().sorted().forEach(s-> list.add(s));
//        Collections.sort(list,(a,b)->b.compareTo(a));
//        System.out.println("新特性"+list);
//        for(String str:list){
//            System.out.println("list方法1------------------------->"+str);
//        }
//        for (int i = 0; i < list.size() ; i++) {
//            System.out.println("list方法2------------------------->"+list.get(i));
//        }
//        Iterator iterator=list.iterator();
//        while (iterator.hasNext()){
//            System.out.println("list方法3------------------------->"+iterator.next());
//        }
//
//
//        Set<String> set=new HashSet<>();
//        set.add("1");
//        set.add("1");
//        set.add("2");
//        set.add("3");
//        for (String str:set) {
//            System.out.println("set方法1------------------------->"+str);
//        }
//        Iterator it=set.iterator();
//        while (it.hasNext()){
//            System.out.println("set方法2------------------------->"+it.next());
//        }
//        for (Object obj: set) {
//            if(obj instanceof Integer){
//                int aa= (Integer)obj;
//            }else if(obj instanceof String){
//                String aa = (String)obj;
//            }
//            System.out.println("set方法3------------------------->"+obj);
//        }
//        Map<String,Integer> map=new HashMap<>();
//        map.put("map1",1);
//        map.put("map2",2);
//        map.put("map3",3);
//        for (Map.Entry<String,Integer> map3:map.entrySet()) {
//            System.out.println("map方法1——————————————>"+"key="+map3.getKey()+"value="+map3.getValue());
//        }
//        for (String map2:map.keySet()) {
//            System.out.println("map方法2----------------------------->"+"key="+map2+"value="+map.get(map2));
//        }
//        Iterator<Map.Entry<String,Integer>> entries=map.entrySet().iterator();
//        while (entries.hasNext()){
//            Map.Entry<String,Integer> entry=entries.next();
//            System.out.println("map方法3---------------------->"+"key="+entry.getKey()+"value="+entry.getValue());
//        }
//        map.forEach((k,v)->{
//            System.err.println("使用java8循环 /姓名 : " +k + " 分数 : " + v);
//        });
//        list.forEach(
//                System.out::println
//        );
//        list.forEach((String integer) -> {
//            System.out.println(integer);
//        });
//        list.forEach(in->{
//            System.out.println(in);
//        });
//        list.indexOf(1);
//    }*/
//    }
//}
