package com.xn.controller;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2018/1/15.
 */
public class Lambda {
    public static void main(String[] args) {
        String value="s,s,w,q,w,";
        value=value.substring(0,value.length()-1);
        System.out.println("-------------------------->"+value);

       /* String str="  lssw  df f   ";
        System.out.println(str.trim());*/
     /*  String str2 = "abd123:adad46587:asdadasadsfgi#%^^9090";
        String s= "\\d";
        s = flag==1?s:"";
        System.out.println(s);*/
        //System.out.println(str2.replaceAll("[0-9]", "*"));
        //System.out.println(str2.replaceAll(s, ""));*/
        String e="                              ";
        System.out.println(e.length());
        String json="{\n" +
                "    \"result\": {\n" +
                "        \"bots\": [\n" +
                "            {\n" +
                "                \"botStatus\": \"running\",\n" +
                "                \"createTime\": \"2018-08-20 12:30:59\",\n" +
                "                \"botName\": \"梳理流程\",\n" +
                "                \"botCategory\": \"user\",\n" +
                "                \"botDesc\": \"正式的问答\",\n" +
                "                \"updateTime\": \"2018-08-20 15:56:19\",\n" +
                "                \"botId\": \"10052\",\n" +
                "                \"botVersion\": \"8\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"botStatus\": \"running\",\n" +
                "                \"createTime\": \"2018-08-13 09:55:56\",\n" +
                "                \"botName\": \"开发测试\",\n" +
                "                \"botCategory\": \"user\",\n" +
                "                \"botDesc\": \"演示\",\n" +
                "                \"updateTime\": \"2018-08-22 11:02:27\",\n" +
                "                \"botId\": \"9687\",\n" +
                "                \"botVersion\": \"34\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"botStatus\": \"running\",\n" +
                "                \"createTime\": \"2018-07-31 11:31:43\",\n" +
                "                \"botName\": \"开发机器人\",\n" +
                "                \"botCategory\": \"user\",\n" +
                "                \"botDesc\": \"描述\",\n" +
                "                \"updateTime\": \"2018-08-17 09:01:01\",\n" +
                "                \"botId\": \"8942\",\n" +
                "                \"botVersion\": \"79\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"botStatus\": \"running\",\n" +
                "                \"createTime\": \"2018-07-27 18:14:41\",\n" +
                "                \"botName\": \"主人是韩洋\",\n" +
                "                \"botCategory\": \"user\",\n" +
                "                \"botDesc\": \"服务于主人\",\n" +
                "                \"updateTime\": \"2018-08-17 09:00:01\",\n" +
                "                \"botId\": \"8756\",\n" +
                "                \"botVersion\": \"3\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"botStatus\": \"running\",\n" +
                "                \"createTime\": \"2018-07-24 17:14:13\",\n" +
                "                \"botName\": \"修改\",\n" +
                "                \"botCategory\": \"user\",\n" +
                "                \"botDesc\": \"\",\n" +
                "                \"updateTime\": \"2018-08-10 11:47:41\",\n" +
                "                \"botId\": \"8441\",\n" +
                "                \"botVersion\": \"17\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"botStatus\": \"running\",\n" +
                "                \"createTime\": \"2018-07-24 16:59:11\",\n" +
                "                \"botName\": \"对对对\",\n" +
                "                \"botCategory\": \"user\",\n" +
                "                \"botDesc\": \"是谁\",\n" +
                "                \"updateTime\": \"2018-07-24 16:59:11\",\n" +
                "                \"botId\": \"8436\",\n" +
                "                \"botVersion\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"botStatus\": \"running\",\n" +
                "                \"createTime\": \"2018-07-23 10:34:49\",\n" +
                "                \"botName\": \"测试\",\n" +
                "                \"botCategory\": \"user\",\n" +
                "                \"botDesc\": \"\",\n" +
                "                \"updateTime\": \"2018-08-15 17:43:25\",\n" +
                "                \"botId\": \"8256\",\n" +
                "                \"botVersion\": \"6\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"totalCount\": 7,\n" +
                "        \"currentPage\": 1\n" +
                "    },\n" +
                "    \"error_msg\": \"ok\",\n" +
                "    \"error_code\": 0\n" +
                "}";
        String type="botName";
        System.out.println(json.indexOf(type));
        String subString= json.substring(json.indexOf(type));
        String result = subString.substring(subString.indexOf(":")+1,subString.indexOf(",")).replaceAll("\"","").trim();

        System.out.println(result);
//        String str="##3333##";
//        String tempStr;
//        System.out.println(str.startsWith("##")&&str.endsWith("##"));
//      System.out.println( tempStr = str.substring(str.indexOf("##") + 2, str.lastIndexOf("##")));
  /*        List<User> list=new ArrayList<User>();
        User user1=new User();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                user1.setName("zhangsan"+j);
                user1.setAge(i);
                list.add(user1);
            }
        }*/
//       list.forEach(s-> System.out.println(s));
      /*  List<User> list=new ArrayList<User>();
        User user1=new User();
        user1.setName("zhangsan");
        user1.setAge(12);
        list.add(user1);
        User user2=new User();
        user2.setName("lisi");
        user2.setAge(15);
        list.add(user2);
        User user3=new User();
        user3.setName("zhangsan");
        user3.setAge(11);
        list.add(user3);
        list.forEach(s->s.setAge(12));
        System.out.println(list);*/
//        Optional<User> any = list.stream().filter(s -> s.getAge() < 15).findAny();
//        List<User> collect1 = list.stream().filter(s -> s.getAge() < 15).collect(Collectors.toList());
//        List<User> collect = list.stream().filter(s -> "zhangsan".equals(s.getName())).collect(Collectors.toList());
//        User cateCountEntity = any.get();
//        System.out.println(collect);
//        cateCountEntity.setFalg(1234);
//        list.add(cateCountEntity);
//        list.forEach(s->{
//            System.out.println(s);
//        });
//        if (any == Optional.<User>empty()){
//            System.out.println(12);
//        }else {
//            System.out.println(any.get());
//        }
        /*Arrays.asList("a","b","c").forEach(e-> {
            System.out.println(e);
            System.out.println(e);
        });*/
       /* String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );
*/
       /* List<Student> list1 = new ArrayList<Student>();
        list1.add(new Student("林青霞", 27));
        list1.add(new Student("风清扬", 30));
        list1.add(new Student("刘晓曲", 28));
        list1.add(new Student("武鑫", 29));
        list1.add(new Student("林青霞", 27));

        int index=Collections.binarySearch(list1, new Student("林青霞", 27));
        System.out.println(index);*/


    }
    /**
     * 截取字符串str中指定字符 strStart、strEnd之间的字符串
     *
     * @param string
     * @param str1
     * @param str2
     * @return
     */
    public static String subString(String str, String strStart, String strEnd) {

        /* 找出指定的2个字符在 该字符串里面的 位置 */
        int strStartIndex = str.indexOf(strStart);
        int strEndIndex = str.indexOf(strEnd);

        /* index 为负数 即表示该字符串中 没有该字符 */
        if (strStartIndex < 0) {
            return "字符串 :---->" + str + "<---- 中不存在 " + strStart + ", 无法截取目标字符串";
        }
        if (strEndIndex < 0) {
            return "字符串 :---->" + str + "<---- 中不存在 " + strEnd + ", 无法截取目标字符串";
        }
        /* 开始截取 */
        String result = str.substring(strStartIndex, strEndIndex).substring(strStart.length());
        return result;
    }

}
