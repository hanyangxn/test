package com.xn.moshi.zhuangshizhe;

/**
 * Created by Administrator on 2018/12/29.
 */
public class Decorator extends Coffee{
    public Coffee coffee;

    public float getPrice() {
        return coffee.getPrice();
    }

    public void getTaste() {
        coffee.getTaste();
    }

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
