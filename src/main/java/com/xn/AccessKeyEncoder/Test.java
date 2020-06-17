package com.xn.AccessKeyEncoder;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String args[]){
//        int a[]={-1,-2,4,-1,3,-2};    //测试用例
//        int length=a.length;
//        int cur=a[0];
//        int max=a[0];
//        for(int i=0;i<length;i++) {
//            if(cur<0)
//                cur=0;
//            cur+=a[i];
//            if(cur>max)
//                max=cur;
//        }
//        System.out.println(max);
        List<String> list =new ArrayList<>();
//        list.add("END");
        list.add("PREEND");
//        list.add("START");

        System.out.println(list.get(0).contains("END"));
//        System.out.println(CollectionUtils.isEmpty(list));
    }
}
