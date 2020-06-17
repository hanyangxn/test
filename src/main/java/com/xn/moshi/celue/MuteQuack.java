package com.xn.moshi.celue;

/**
 * Created by Administrator on 2018/11/21.
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
