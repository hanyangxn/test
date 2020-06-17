package com.xn.moshiTest.zhuangshi;

public class Client {
    public static void main(String[] args) {
        WhiteCar whiteCar = new WhiteCar();
        Decorator decorator = new Decorator(whiteCar);
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(decorator);
        concreteDecorator.operation();
        concreteDecorator.add();

    }
}
