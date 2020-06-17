package com.xn.moshiTest.shipeiqi_qiaojie;

public class DellComputer extends Computer {
    @Override
    public void connecct() {
        System.out.print("戴尔电脑");
        computer.USB();
    }

    public DellComputer(ComputerInterface computer) {
        super(computer);
    }
}
