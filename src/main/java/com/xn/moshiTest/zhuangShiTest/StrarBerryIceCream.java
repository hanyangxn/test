package com.xn.moshiTest.zhuangShiTest;

/**
 * Created by Administrator on 2019/1/4.
 */
public class StrarBerryIceCream extends Dector {
    private static final float price=9F;
    public StrarBerryIceCream(IceCreamm iceCreamm) {
        super(iceCreamm);
    }

    @Override
    public float getPrice() {
        return super.getPrice()+price;
    }

    @Override
    public void getFlavor() {
        super.getFlavor();
        System.out.println("加点草莓味");
    }
}
