package com.xn.moshi.jianzao_gongchang;

/**
 * 具体产品
 */
public class EnergyCar extends Builder implements CarInterface {
    @Override
    public void run() {
        System.out.println("新能源");
    }

    @Override
    public CarEntity getCarEntity() {
        super.setColor("红色");
        super.setMotor("1.5");
        super.setType("轿车");
        return super.carEntity;
    }
}
