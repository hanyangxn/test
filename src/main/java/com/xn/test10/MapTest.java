package com.xn.test10;

import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(3,"我是3");
        treeMap.put(1,"我是1");
        treeMap.put(2,"我是2");
        //查找大于等于 key的最小值
        Integer integer = treeMap.ceilingKey(2);
        System.out.println(integer);
        treeMap.entrySet().forEach(s->{
            System.out.println(s.getKey() + "======" +s.getValue());
        });
        //查找小于等于 key的最大值
        Map.Entry<Integer, String> integerStringEntry = treeMap.floorEntry(2);
        System.out.println(integerStringEntry.getValue());




















        //键或值是否存在
        boolean b = treeMap.containsKey(1);
        treeMap.containsValue("我是2");
    }
}
