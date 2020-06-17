package com.xn.moshi.jianzao_gongchang;

/**
 * 具体工厂类
 */
public class EnergyCarFactory implements CarFactory {
    @Override
    public CarInterface car() {
        return new EnergyCar();
    }
}
