package com.xn.moshi.jianzao_gongchang;

/**
 * 具体工厂类
 */
public class BenziCarFactory implements CarFactory{
    @Override
    public CarInterface car() {
        return new BenzinCar();
    }
}
