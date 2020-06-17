//package com.xn.test;
//
//import com.xn.controller.User;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
///**
// * Created by Administrator on 2018/4/18.
// */
//public class LambdaTest {
//    public static void main(String[] args) {
//        List<User> list=new ArrayList<User>();
//        User user1=new User();
//        user1.setName("zhangsan");
//        user1.setAge(12);
//        list.add(user1);
//        User user2=new User();
//        user2.setName("lisi");
//        user2.setAge(15);
//        list.add(user2);
//        User user3=new User();
//        user3.setName("zhangsan");
//        user3.setAge(15);
//        list.add(user3);
//
//        List<User> collect = list.stream().filter(s -> s.getName() == "zhangsan").collect(Collectors.toList());
//        System.out.println(collect);
//    }
//}
