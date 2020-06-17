package com.xn.moshi.jianzao_gongchang;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        /**
         *  建造着模式  具体建造者 =  工厂模式   具体产品
         */
        EnergyCarFactory energyCarFactory = new EnergyCarFactory();
        EnergyCar car = (EnergyCar)energyCarFactory.car();
        car.run();
        System.out.println(car.getCarEntity());
    }
}
