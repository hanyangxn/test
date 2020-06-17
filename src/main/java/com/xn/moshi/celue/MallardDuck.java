package com.xn.moshi.celue;

/**
 * Created by Administrator on 2018/11/21.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
           quackBehavior = new Quack();
           flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
