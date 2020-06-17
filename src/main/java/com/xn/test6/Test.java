package com.xn.test6;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/29.
 */
public class Test {
    public static void main(String[] args) {
        String clientSession="{\"client_results\":\"\",\"candidate_options\":[],%s}";
        Map mapParam=new HashMap();
        mapParam.put("paramNames","name,phone");
        mapParam.put("paramTypes","1,1");
        mapParam.put("name","康1");
        mapParam.put("phone","13033450966");
        StringBuffer param=new StringBuffer();
        for (Object key : mapParam.keySet()) {
            param.append("\""+key+"\""+":\""+mapParam.get(key)+"\",");
        }
        System.out.println(param.substring(0,param.length()-1));
        clientSession = String.format(clientSession,param.substring(0,param.length()-1));
        System.out.println(clientSession);
//        List<Obj> list=new ArrayList<>();
//        User user=new User("zhangsan");
//        User user1=new User("lisi");
//        list.add(user);
//        list.add(user1);
//        for (Obj obj:list) {
//            obj.update("haha");
//        }
    }
}
