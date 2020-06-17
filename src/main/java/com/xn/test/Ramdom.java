package com.xn.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2018/11/20.
 */
public class Ramdom {
    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {
            System.out.println("");
            Set<Integer> set=new HashSet();
            while (set.size()<6){
                set.add ((int) (1 + Math.random() * (33 - 1 + 1)));
            }
            for (Integer s:set) {
                System.out.print("   "+s);
            }
                System.out.print("篮球："+(int) (1 + Math.random() * (16 - 1 + 1)));
        }

        System.out.println("");
    }
}