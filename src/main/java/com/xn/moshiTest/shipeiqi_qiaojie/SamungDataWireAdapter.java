package com.xn.moshiTest.shipeiqi_qiaojie;

public class SamungDataWireAdapter implements ComputerInterface {
    protected SamsungPhone samsung;

    public SamungDataWireAdapter(SamsungPhone samsung) {
        this.samsung = samsung;
    }

    @Override
    public void USB() {
        System.out.print("使用三星数据线连接");
        samsung.samungInterface();
    }
}
