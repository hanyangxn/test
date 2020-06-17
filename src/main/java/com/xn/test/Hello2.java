package com.xn.test;

/**
 * Created by Administrator on 2018/11/19.
 */
public abstract class Hello2 implements Hello{

    @Override
    public void say(String name) {
        System.out.println("我是"+name);
    }

}
