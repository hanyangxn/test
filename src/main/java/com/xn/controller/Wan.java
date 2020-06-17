package com.xn.controller;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Administrator on 2018/1/5.
 */
public class Wan {
        /*String s="我爱的认识你啊";
        String s2=s.substring(1);
        System.out.println(s2);*/

    /*for(int i=0; i<10000; i++){
        System.out.println(i);
    }*/
        /*private volatile static int i = 0;

        public static void main(String[] args) throws InterruptedException {
            Thread a = new Thread() {
                @Override
                public void run() {
                    for( int j = 0 ; j < 1000000 ; j++ ) i++;
                }
            };
            a.start();
            Thread b = new Thread() {
                @Override
                public void run() {
                    for( int j = 0 ; j < 1000000 ; j++ ) i--;
                }
            };
            b.start();
            a.join();
            b.join();
            System.out.println(i);
        }*/
    /*public static void main(String[] args) {
        System.out.println((float) (3*0.1));
        System.out.println(13 * 0.1);
        System.out.println(3 * 0.1 == 0.3);
        System.out.println(13 * 0.1 == 1.3);
        System.out.println(9 * 0.1 == 0.9);
    }*/public static void main(String[] args) throws Exception {
        /*int  array[] = {15, 225, 34, 42, 52, 6, 7856, 865, 954, 10,9};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
        System.out.println(new Random().nextInt(100)+1);
 /*       byte[][] bytes = {
// 00110001
                {(byte)0x31},
// 11000000 10110001
                {(byte)0xC0,(byte)0xB1},
// 11100000 10000000 10110001
                {(byte)0xE0,(byte)0x80,(byte)0xB1},
// 11110000 10000000 10000000 10110001
                {(byte)0xF0,(byte)0x80,(byte)0x80,(byte)0xB1},
// 11111000 10000000 10000000 10000000 10110001
                {(byte)0xF8,(byte)0x80,(byte)0x80,(byte)0x80,(byte)0xB1},
// 11111100 10000000 10000000 10000000 10000000 10110001
                {(byte)0xFC,(byte)0x80,(byte)0x80,(byte)0x80,(byte)0x80,(byte)0xB1},
        };
        for (int i = 0; i < 6; i++) {
            String str = new String(bytes[i], "UTF-8");
            System.out.println("原数组长度：" + bytes[i].length +
                    "/t转换为字符串：" + str +
                    "/t转回后数组长度：" + str.getBytes("UTF-8").length);
        }*/
    }
}
