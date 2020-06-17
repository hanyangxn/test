package com.xn.moshi.xiangyuan;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FlyweightFactory {
    private Map<String, Flyweight> map = new ConcurrentHashMap<>(16);

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = map.get(key);

        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight(key);
            map.put(key, flyweight);
        }

        return flyweight;
    }
}
