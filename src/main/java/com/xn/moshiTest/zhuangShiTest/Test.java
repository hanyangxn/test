package com.xn.moshiTest.zhuangShiTest;

import javax.sound.midi.Soundbank;

/**
 * Created by Administrator on 2019/1/4.
 */
public class Test {
    public static void main(String[] args) {
        IceCreamm ice=new CommonIceCream();
        IceCreamm iceCreamm=new Dector(ice);
        iceCreamm=new MilkIceCream(iceCreamm);
        iceCreamm=new StrarBerryIceCream(iceCreamm);
        System.out.println("总价格为："+iceCreamm.getPrice());
        System.out.println("口味："); iceCreamm.getFlavor();
    }
}
