package com.xn.moshi.zhuangshizhe;

/**
 * Created by Administrator on 2019/1/3.
 */
public class MilkDecorator extends Decorator {
    private final static float MILK_PRICE=5f;

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public float getPrice() {
        return coffee.getPrice()+MILK_PRICE;
    }

    @Override
    public void getTaste() {
        coffee.getTaste();
        System.out.println("加一点点牛奶的口味");
    }
}
