package com.xn.moshi.zhuangshizhe;

/**
 * Created by Administrator on 2019/1/3.
 */
public class SimpleCoffee extends  Coffee {
    private final static float PRICE=50f;
    @Override
    public float getPrice() {
        return PRICE;
    }

    @Override
    public void getTaste() {
        System.out.println("普通咖啡口味");
    }
}
