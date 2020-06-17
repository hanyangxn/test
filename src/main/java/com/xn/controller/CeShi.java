package com.xn.controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2018/3/28.
 */
public class CeShi {
    public static void main(String[] args) {
        String str="##核对信用[ty:[D:user_borwar]][sc:[D:user_score]]##";
        String regEx = "(\\[[^\\]]*\\])";
        String[] arr = str.split(regEx);
        String str1 = "";
        for (String ar :arr) {
            if(!"".equals(ar)){
                str1 = str.replaceAll(ar,"").replace("[","");
                str = str1;
            }
        }
        String[] str2 = str1.split("]");
        Set<String> set = new HashSet<String>();
        for (String str3 : str2) {
            boolean str4 = str3.contains("user_");
            if(str4 == true){
                set.add(str3.substring(str3.indexOf("user_")));
            }
        }
        System.out.println(set);







//        System.out.println("nihao"+"\n"+"sdfas");
//        System.out.println(System.currentTimeMillis()/1000L);

//        String s1 = list.stream().forEach(s -> {sr.contains(s)});
//        System.out.println(s1);
        //        for (int i = 0; i < strs.length; i++) {
//            if (!sr.contains(strs[i])){
//                if (i==0)
//                    sb.append(strs[i]);
//                else
//                    sb.append(","+strs[i]);
//            }
//        }
//        System.out.println(sb);
    }
}
