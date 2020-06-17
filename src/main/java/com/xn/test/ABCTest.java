package com.xn.test;

/**
 * Created by Administrator on 2018/5/13.
 */
public class ABCTest {
    public static void main(String[] args) {
//        String str="@活动 价格@活动期间价格会调整吗";
//        String[] s = str.split("\\@");
//        System.out.println(s[2]);
        String str = "%s/v1/dialog/%s";
        str=String.format(str,"http",2);
        System.out.println(str);
    }
}
