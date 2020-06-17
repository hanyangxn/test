package com.xn.moshiTest.zhuangshi;

public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(CarComponent carComponent) {
        super(carComponent);
    }
    public void add(){
        System.out.println("加装倒车影像");
    }
}
