package com.xn.moshi.jianzao_gongchang;

/**
 * 具体产品
 */
public class BenzinCar extends Builder implements CarInterface {
    @Override
    public void run() {
        System.out.println("汽油");
    }

    @Override
    public CarEntity getCarEntity() {
        super.setColor("黄色");
        super.setMotor("2.0");
        super.setType("SUV");
        return super.carEntity;
    }
}
