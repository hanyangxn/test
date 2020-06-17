package com.xn.moshiTest.zhuangshi;

public class Decorator implements CarComponent{

    private CarComponent carComponent;

    public Decorator(CarComponent carComponent) {
        this.carComponent = carComponent;
    }

    @Override
    public void operation() {
        carComponent.operation();
    }
}
