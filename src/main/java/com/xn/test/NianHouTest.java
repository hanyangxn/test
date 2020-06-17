package com.xn.test;

import com.xn.util.EnumNianHou;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/2/22.
 */
public class NianHouTest {
    public static void main(String[] args) {
        EnumNianHou[] values = EnumNianHou.values();
        String str="";
        Map  map=new HashMap();
        map.put("First","first");
        map.put("Second","second");
        for (EnumNianHou hou:values) {
            if (!map.containsKey(hou.toString())){
                str+=hou.toString();
            }
        }
        System.out.println(str);
    }
}
