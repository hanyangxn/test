package com.xn.moshiTest.zhuangShiTest;

/**
 * Created by Administrator on 2019/1/4.
 */
public class Dector extends IceCreamm{
    public IceCreamm iceCreamm;

    public Dector(IceCreamm iceCreamm) {
        this.iceCreamm = iceCreamm;
    }

    @Override
    public float getPrice() {
        return iceCreamm.getPrice();
    }

    @Override
    public void getFlavor() {
        iceCreamm.getFlavor();
    }


}
