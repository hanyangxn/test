//package com.xn.test10;
//
//import org.springframework.data.convert.EntityWriter;
//
//import java.util.HashSet;
//import java.util.Set;
//
///**
// * Created by Administrator on 2018/8/27.
// */
//public class PiPei {
//    public static void main(String[] args) {
//        // 要验证的字符串
//        String str = "##核对信用[ty:[D:user_borwar]][sc:[D:user_score]]##";
////        System.out.println(str.replace("user_wild_nb","123123"));
//        // 身份证验证规则
////        String regEx = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9])|(17([0-9])))|(18[0-4,5-9]))\\d{8}$";
//        String regEx = "(\\[[^\\]]*\\])";
//        String[] arr = str.split(regEx);
//        String str1 = "";
//        for (String ar :arr) {
//            if(!"".equals(ar)){
//                str1 = str.replaceAll(ar,"").replace("[","");
//                str = str1;
//            }
//        }
//        String[] str2 = str1.split("]");
//        Set<String> set = new HashSet<>();
//        for (String str3 : str2) {
//            boolean str4 = str3.contains("user_");
//            if(str4 == true){
//                set.add(str3.substring(str3.indexOf("user_")));
//            }
//        }
////        String spr="nninin:[D:user_dsd]";
//        for (String li : set) {
//            System.out.println(li);
//        }
//    }
//}
