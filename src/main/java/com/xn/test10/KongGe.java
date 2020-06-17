//package com.xn.test10;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
///**
// * Created by Administrator on 2018/10/23.
// */
//public class KongGe {
//    public static void main(String[] args) {
//        String str="ROUTE\t0.8\t[D:user_start][D:user_time]#@##1#@##0#@@##[D:kw_to]#@##2#@##1#@@##[D:user_end]#@##3#@##1\t1";
////        str+="repeatMsg = \"第\"+i+\"行意图有误！\"";
////        System.out.println(str);
//        List<String> list = Arrays.asList(str.split("\\\t"));
//        list.forEach(s -> {
////            System.out.println(s);
//        });
//        String patternSegment = list.get(2);
//        List<String> patternSegmentList = Arrays.asList(patternSegment.split("#@@##"));
//        for (String str1:patternSegmentList) {
//            List<String> list1 = Arrays.asList(str1.split("#@##"));
//            list1.forEach(s->{
//                System.out.println(s);
//            });
////            Set<String> slotName = getSlotName(list1.get(0));
////                slotName.forEach(w->{
////                    System.out.println(w);
////                });
//        }
//
////            for (int i = 0; i < list1.size(); i++) {
////                System.out.println(list1.get(i));
//////                Set<String> slotName = getSlotName(list1.get(0));
//////                slotName.forEach(w->{
//////                    System.out.println(w);
//////                });
////        }
//
//    }
//    private static Set<String> getSlotName(String param) {
//        String regex = "\\[D:user_";
//        String head = "user_";
//        Set<String> set = new HashSet<>();
//        try {
//            String[] arr = param.split(regex);
//            for (int i = 1; i < arr.length; i++) {
//                String a = arr[i].substring(0, arr[i].indexOf("]"));
//                set.add(head + a);
//            }
//        } catch (Exception e) {
//            System.out.println("Exception " + e.getMessage());
//        }
//
//        return set;
//    }
//}
