package com.xn.util;

import com.xn.service.impl.UserServiceImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/30.
 */
public enum  EnmuLei {
    ALIYUN("ALIYUN", UserServiceImpl.class),
    TULING("TULING", UserServiceImpl.class);

    private String name;
    private Class<?> userServiceImpl;
    private static Map<String,EnmuLei> envMap=new HashMap<>();
    EnmuLei(String name, Class<?> userServiceImpl) {
        this.name=name;
        this.userServiceImpl=userServiceImpl;
    }
    static {
        for (EnmuLei env:EnmuLei.values()) {
            envMap.put(env.getName(),env);
        }
    }
    public static EnmuLei geByName(String name){
        if (!envMap.containsKey(name)){
            return null;
        }
        return envMap.get(name);
    }

    public String getName() {
        return name;
    }

    public Class<?> getUserServiceImpl() {
        return userServiceImpl;
    }
}
