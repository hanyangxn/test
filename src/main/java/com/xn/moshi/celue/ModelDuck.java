package com.xn.moshi.celue;

/**
 * Created by Administrator on 2018/11/21.
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior= new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a modle duck!");
    }
}
