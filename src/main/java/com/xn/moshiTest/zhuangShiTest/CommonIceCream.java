package com.xn.moshiTest.zhuangShiTest;

/**
 * Created by Administrator on 2019/1/4.
 */
public class CommonIceCream extends IceCreamm {
    private final static float price=50F;
    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void getFlavor() {
        System.out.println("原味的");
    }
}
