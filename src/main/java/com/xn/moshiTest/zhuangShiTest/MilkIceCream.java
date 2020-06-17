package com.xn.moshiTest.zhuangShiTest;

/**
 * Created by Administrator on 2019/1/4.
 */
public class MilkIceCream extends Dector {
    private static final  float price=15F;
    public MilkIceCream(IceCreamm iceCreamm) {
        super(iceCreamm);
    }

    @Override
    public float getPrice() {
        return super.getPrice()+price;
    }

    @Override
    public void getFlavor() {
        super.getFlavor();
        System.out.println("加点牛奶味");
    }
}
