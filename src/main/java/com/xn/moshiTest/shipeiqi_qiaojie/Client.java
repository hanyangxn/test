package com.xn.moshiTest.shipeiqi_qiaojie;

public class Client {
    public static void main(String[] args) {
        /**
         * 桥接模式
         */
        UDisk uDisk = new UDisk();
        DellComputer dellComputer = new DellComputer(uDisk);
        dellComputer.connecct();

        /**
         * 适配器
         */
        XiaomiDataWireAdapter xiaomiDataWireAdapter;
        xiaomiDataWireAdapter = new XiaomiDataWireAdapter(new XiaomiPhone());
        xiaomiDataWireAdapter.USB();

        /**
         * 适配器+桥接
         * 使用适配器模式将 适配者和抽象化角色整合
         * 适配器模式的 目标= 桥接模式  抽象化角色
         * 适配器模式的  适配器= 桥接模式  具体抽象化角色
         */
        ASUSComputer asusComputer = new ASUSComputer(new SamungDataWireAdapter(new SamsungPhone()));
        asusComputer.connecct();
    }
}
