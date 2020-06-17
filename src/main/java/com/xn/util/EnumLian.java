package com.xn.util;

import com.xn.service.UserService;
import com.xn.service.impl.UserServiceImpl;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by Administrator on 2018/2/2.
 */
public enum EnumLian {
    ALIYUN("ALIYUN", UserServiceImpl.class),
    TULING("TULING", UserServiceImpl.class);
    private String name;
    private Class<?> userServiceImpl;
    private static Map<String,EnumLian> map=new HashMap<String,EnumLian>();
    static {
        for (EnumLian str:EnumLian.values()){
            map.put(str.getName(),str);
        }
    }

    EnumLian(String name, Class<?> userServiceImpl) {
        this.name = name;
        this.userServiceImpl = userServiceImpl;
    }

    public static EnumLian geByName(String name){
        if (!map.containsKey(name)){
            return null;
        }
        return map.get(name);
    }
    public String getName() {
        return name;
    }

    public Class<?> getUserServiceImpl() {
        return userServiceImpl;
    }
}
