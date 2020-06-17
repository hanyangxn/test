package com.xn.moshi.celue;

/**
 * Created by Administrator on 2018/11/21.
 */
public class MallarDucktest {
    public static void main(String[] args) {
        Duck mallar=new MallardDuck();
        mallar.performFly();
        mallar.performQuack();
        Duck model=new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
