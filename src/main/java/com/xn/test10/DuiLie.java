package com.xn.test10;

import com.xn.controller.Lambda;

import java.security.Provider;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Administrator on 2018/10/9.
 */
public class DuiLie {
    interface Lambda<K, V> {
        V printMsg(K a, K b);
    }

    public static void main(String[] args) {
//        BlockingQueue<Date> queue=new LinkedBlockingQueue<>();
//        Provider p1=new Provider(queue);
//        List<Map<>>
//        String paramsAll="pageNo:user_pageno,pageSize:user_pagesize";
//        List<String> paramsList = Arrays.asList(paramsAll.split(","));
//        for (:paramsList) {

//        }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "天王盖地虎,");
        map.put(2, "宝塔镇河妖");

        test(1, 2, (a, b) -> map.get(a) + map.get(b));
    }
        public static void test(Integer n, Integer m, Lambda<Integer, String> lambda) {
            System.out.println(lambda.printMsg(n, m));
    }
}
