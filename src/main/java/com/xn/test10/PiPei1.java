//package com.xn.test10;
//
//import com.alibaba.fastjson.JSONObject;
//
//import java.util.*;
//
///**
// * Created by Administrator on 2018/9/9.
// */
//public class PiPei1 {
//    public static void main(String[] args) {
//        // 要验证的字符串
////        String str = "##核对信用[ty:[D:user_borwar]][sc:[D:user_score]]##";
//////        System.out.println(str.replace("user_wild_nb","123123"));
////        // 身份证验证规则
//////        String regEx = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9])|(17([0-9])))|(18[0-4,5-9]))\\d{8}$";
////        String regEx = "(\\[[^\\]]*\\])";
////        String[] arr = str.split("D:");
////        Set<String> set = new HashSet<>();
////        for (String ar :arr) {
////            if(ar.contains("user_")){
////                set.add(ar.substring(ar.indexOf("user_"),ar.indexOf("]")));
////            }
////        }
////        for (String str1:set) {
////            System.out.println(str1);
////        }
//        String content = "[\"我没听清你说的话，您能再说一遍吗？\",\"777777\"]";
//        List<String> arrayLists = JSONObject.parseArray(content, String.class);
//        System.out.println(arrayLists.get(0));
//
//        int[] arr={1,2,3,2,2};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int a=0;
//        int b=arr[0];
//        Map<Integer,Integer> map=new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (b!=arr[i]){
//                b=arr[i];
//                a=1;
//            }else {
//                a++;
//            }
//            map.put(b,a);
//        }
//
//    }
//}
