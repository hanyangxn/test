package com.xn.moshiTest.shipeiqi_qiaojie;

public class XiaomiDataWireAdapter implements ComputerInterface {
    private XiaomiPhone xiaomiPhone;

    public XiaomiDataWireAdapter(XiaomiPhone xiaomiPhone) {
        this.xiaomiPhone = xiaomiPhone;
    }

    @Override
    public void USB() {
        System.out.print("使用小米数据线连接");
        xiaomiPhone.xiaomiInterface();
    }
}
