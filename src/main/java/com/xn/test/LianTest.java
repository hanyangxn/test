package com.xn.test;

import com.alibaba.fastjson.JSONObject;
import com.xn.service.UserService;
import com.xn.service.impl.UserServiceImpl;
import com.xn.util.*;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/1/29.
 */
public class LianTest {
    private static UserService se;
    private static ApplicationContext ctx;

    public void setCtx(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    public static void main(String[] args) {
      /*  Object bean = ctx.getBean(UserServiceImpl.class);
        se=(UserService) bean;*/
       /* User df = JSONObject.parseObject("df", User.class);
        System.out.println(df);*/


     /*   UserService service;
        service = (UserService) UserServiceImpl;*/




        /*Map map=new HashMap();
        map.put("df","dsf1");
        map.put("dg","dsf2");
        map.put("dh","dsf3");
        System.out.println(JSONObject.toJSONString(map));*/
      EnmuLei lei = EnmuLei.geByName("ALIYUN");
        System.out.println(lei);
       Class<?> user=null;
       user= lei.getUserServiceImpl();
        System.out.println(user);
       // WanTest.getBean(user);

        /*String intentionIds="ni,wo,ta,df,m,n,bv";
        String intentionIds2="ni,wo,ta,df,m,n,bv";
        System.out.println(Arrays.asList(intentionIds2.split(",")));
        System.out.println(Arrays.asList(intentionIds.split(",")).stream().collect(Collectors.toList()));*/
       /* String str="";
        Lian[] values = Lian.values();
        KeXuanLian[] lians = KeXuanLian.values();
        for (int i = 0; i < values.length; i++) {

        }
        String sss="  dsf";
        str+=Arrays.toString(lians);
        System.out.println(str);*/
      /*  Map<String,Object> map=new HashMap<>();
        map.put("sf","sdfd");
        map.put("sdf",21);
        String sf = (String) map.get("sf");
        System.out.println(sf);*/
        //System.out.println(str+=lians.toString());
    }
}
