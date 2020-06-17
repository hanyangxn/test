package com.xn.moshi.celue;

/**
 * Created by Administrator on 2018/11/21.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void swim(){
        System.out.println("All ducks float,even decoys!");
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior=fb;
    }
    public void setQuackBehavior(QuackBehavior qk){
        quackBehavior=qk;
    }
}
