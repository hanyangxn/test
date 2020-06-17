package com.xn.controller;


import java.time.Clock;
import java.time.Instant;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2018/1/16.
 */
public class LambdaMap {
  /*  public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }
        map.computeIfPresent(3,(num, val)->val+num);
        System.out.println(map.get(3));
    }*/
  public static void main(String[] args) {
     /* Clock clock = Clock.systemDefaultZone();
      long millis = clock.millis();
      Instant instant = clock.instant();
      Date legacyDate = Date.from(instant);
      System.out.println(millis);
      System.out.println(instant);
      System.out.println(legacyDate);*/
     /* List<String> stringCollection = new ArrayList<>();
      stringCollection.add("ddd2");
      stringCollection.add("aaa2");
      stringCollection.add("bbb1");
      stringCollection.add("aaa1");
      stringCollection.add("bbb3");
      stringCollection.add("ccc");
      stringCollection.add("bbb2");
      stringCollection.add("ddd1");
      stringCollection.stream().sorted().filter(s -> s.startsWith("a")).forEach(s -> System.out.println(s));*/
 /*    int[] arr=new int[]{1,2,3,1,3,4,32,2,3,22,3432,2,3,3,43,3,88,3};
     Arrays.sort(arr);
     List<Integer> list=new ArrayList<>();
     Integer temp=arr[0];
     Integer num=0;
     Map<Integer,Integer> map=new HashMap<>();
      for (int i = 0; i < arr.length ; i++) {
          if (temp!=arr[i]){
              temp=arr[i];
              num=1;
          }else {
              num++;
          }
          map.put(arr[i],num);
      }
      List<Map.Entry<Integer,Integer>> list1=new LinkedList<>(map.entrySet());
      Collections.sort(list1,(a,b)->a.getValue().compareTo(b.getValue()));
      list1.forEach(s->{
          System.out.println(s.getKey()+"出现"+s.getValue()+"次");
      });*/

  /*  List<String> list=new ArrayList<>();
    Collections.addAll(list,"1","2","3");
    list.forEach(s -> System.out.println(s));
    Set<String> set=new HashSet<>();
    set.addAll(list);
    set.forEach(s -> System.out.println(s));
    list.clear();
    list.addAll(set);
    list.forEach(s -> System.out.println(s));*/

   /* List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    Integer[] objects = list.toArray(new Integer[list.size()]);
    System.out.println(objects);*/
    /*  String qq = "123213";

      String regex = "[1-9]";

      boolean flag = qq.matches(regex);
      if(flag)
          System.out.println(qq+"...is ok");
      else
          System.out.println(qq+"... 不合法");*/
    /*  String str = "101";//将字符串中的数字替换成#。
      String pattern="[1-9]\\d*";
      boolean b = str.matches(pattern);
      System.out.println( b);*/

      String str2 = "2\2";
      String pattern2 = "\\d{1}[\\\\]\\d{1}";

      //Pattern r = Pattern.compile(pattern2);
      System.out.println(str2.matches(pattern2));
      //str = str.replaceAll("\\d{5,}","#");


  }
}
