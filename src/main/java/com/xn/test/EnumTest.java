package com.xn.test;


import com.xn.util.EnumWan;
import com.xn.util.User;

/**
 * Created by Administrator on 2018/2/2.
 */
public class EnumTest {
    public static void main(String[] args) {
        /*System.out.println(EnumWan.values().toString());*/
        for (EnumWan w:EnumWan.values()) {
            System.out.println(w);
        }
    }
}
