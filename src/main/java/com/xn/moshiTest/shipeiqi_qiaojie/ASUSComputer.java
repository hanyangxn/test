package com.xn.moshiTest.shipeiqi_qiaojie;

public class ASUSComputer extends Computer {
    public ASUSComputer(ComputerInterface computer) {
        super(computer);
    }

    @Override
    public void connecct() {
        System.out.print("华硕电脑");
        computer.USB();
    }
}
