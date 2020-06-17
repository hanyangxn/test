package com.xn.moshi.gongchang;

/**
 * Created by Administrator on 2019/1/24.
 */
public class Test {
    public static void main(String[] args) {
        //2.工厂模式， 由动物工厂生产出我们指定的动物，并利用产生的动物实例调用其run方法
        IAninmalFactory factory = new AnimalFactory();
        factory.createAnimal("Pig").run();
        factory.createAnimal("Cat").run();
    }
}
