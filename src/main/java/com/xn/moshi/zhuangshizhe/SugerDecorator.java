package com.xn.moshi.zhuangshizhe;

/**
 * Created by Administrator on 2019/1/3.
 */
public class SugerDecorator extends Decorator {
    private static final float SUGER_PRICE=6f;
    public SugerDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public float getPrice() {
        return coffee.getPrice()+SUGER_PRICE;
    }

    @Override
    public void getTaste() {
        coffee.getTaste();
        System.out.println("加点糖,甜甜的");
    }
}
