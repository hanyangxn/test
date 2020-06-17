//package com.xn.controller;
//
//import com.sun.org.apache.xpath.internal.SourceTree;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
///**
// * Created by Administrator on 2018/3/13.
// */
//public class Test {
//    public static void main(String[] args) {
//        List<User> list=new ArrayList<User>();
//        List<User> list1=new ArrayList<>();
//        User user1=new User();
//        user1.setName("zhangsan");
//        user1.setAge(12);
//        list.add(user1);
//        User user2=new User();
//        user2.setName("lisi");
//        user2.setAge(15);
//        list.add(user2);
//        User user3=new User();
//        user3.setAge(15);
//        list.add(user3);
//        List<User> collects = list.stream().filter((s) -> s.getName()!=null).collect(Collectors.toList());
//        List<User> collects2 = list.stream().filter((s) -> s.getName()==null).collect(Collectors.toList());
//        list1.addAll(collects);
//        list1.addAll(collects2);
//        collects.forEach(a->{
//            a.setFalg(1);
//        });
//        list.addAll(collects);
//        System.out.println(list);
//        System.out.println(collects);
//        System.out.println(list1);
//    }
//}
