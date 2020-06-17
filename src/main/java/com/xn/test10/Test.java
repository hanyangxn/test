package com.xn.test10;

import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JinKai on 2018/8/10.
 */
public class Test {
    @Transactional
    public static void main(String[] args) {
        int count =1;
        count++;
        System.out.println(count);
        //已同步的
//        List<String> intentIdList=new ArrayList<String>();
//        //所有的
//        List<String> intentIdAllList=new ArrayList<String>();
//        intentIdList.add("1231");
//        intentIdList.add("1232");
//        intentIdList.add("1233");
//        intentIdList.add("1234");
//        intentIdAllList.add("1234");
//        intentIdAllList.add("1231");
//        intentIdAllList.add("1234567");
//        intentIdAllList.add("123456897");
//        intentIdAllList.removeAll(intentIdList);
//        System.out.println(intentIdAllList);
//        User user=new User();
//        if ("13".equals(user.getName())){
//            System.out.println("sfd");
//        }
//        String s=" ##[D:user_wild_nb]开票信息##";
//        if ("##".equals(s.substring(0,2))&&"##".equals(s.substring(s.length()-2,s.length()))){
//        }
//        System.out.println(list);
////        String s="@   #    1    #@@##";
////        System.out.println(s.substring(0,s.length()-5));
////        User s1=null;
////        System.out.println(s1.getName());
////        System.out.println("\t"+"ss");
////       List<String> list=new ArrayList<>();
////        List<String> list2=new ArrayList<>();
////       list.add("[D:kw_12]");
////       list.add("[D:kw_110]");
////        for (String str:list) {
////            list2.add(str.substring(3,str.length()-1));
////        }
////        list2.forEach(s -> {
////            System.out.println(s);
////        });
//        Ceshi ceshi=new Ceshi();
//        ceshi.setAge(12);
//        ceshi.setName("zhangsan");
//        Ceshi ceshi1=new Ceshi();
//        ceshi1.setAge(18);
//        ceshi1.setName("lisi");
//        List<Ceshi> list=new ArrayList<>();
//        list.add(ceshi);
//        list.add(ceshi1);
//        String objects = JSON.toJSONString(list);
//        System.out.println(objects);
//        List<Ceshi> ts = (List<Ceshi>) JSONArray.parseArray(objects, Ceshi.class);
//        System.out.println(ts);

//        String s = list.toString();
//        String join = String.join();
//        System.out.println(s);
//        List<Ceshi> list = Arrays.asList(s,List<>);
//        String nameStr = Joiner.on(",").join(list);
//        System.out.println(nameStr);
       /* ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
//        service.scheduleAtFixedRate(new Task(list), 10, 2, TimeUnit.SECONDS);
        service.schedule(new Task(list),20,TimeUnit.SECONDS);
        System.out.println("-----------------------------------------------------------------######################——————————————————————————————————————");*/
    }

}
