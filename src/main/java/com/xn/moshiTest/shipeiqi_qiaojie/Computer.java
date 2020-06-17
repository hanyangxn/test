package com.xn.moshiTest.shipeiqi_qiaojie;

public abstract class Computer {
    protected ComputerInterface computer;

    public Computer(ComputerInterface computer) {
        this.computer = computer;
    }

    public abstract void connecct();
}
