package com.xn.controller;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Map.Entry;
import java.util.*;

/**
 * Created by Administrator on 2018/1/9.
 */
public class PaiXu {
    public static void main(String[] args) {
        int[] arr2={1,2,3,6,3,4,5,4,5,77,88,77,34,22,1,2,1,2,1,3,5,5,5,5};
        Arrays.sort(arr2);
       /* List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            list.add(arr2[i]);
        }*/
        int count=0;
        int tem=arr2[0];
        Map<Integer,Integer> map=new HashMap();
        for (int i = 0; i < arr2.length; i++) {
                if (tem!=arr2[i]){
                    tem=arr2[i];
                    count=1;
                }else{
                    count++;
                }
                map.put(arr2[i],count);
        }
     /*   for (Integer m:map.keySet()) {
            System.out.println(m+"dds "+map.get(m));
        }*/
        List<Map.Entry<Integer,Integer>> list=new LinkedList<>( map.entrySet());
        Collections.sort(list,(a,b)->b.getValue().compareTo(a.getValue()));
       /* Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });*/
        Map<Integer,Integer> linkMap=new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> newEntry :list){
            linkMap.put(newEntry.getKey(), newEntry.getValue());
        }
        for (Map.Entry<Integer,Integer> ma:linkMap.entrySet()) {
            System.out.println("key:"+ma.getKey()+"  value:"+ma.getValue());
        }
    }
}
