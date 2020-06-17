package com.xn.moshiTest.zuhe.test;

public class Garnish implements HotPot {

    private String name;
    private float price;

    public Garnish(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public float price() {
        return price;
    }

    @Override
    public void show() {
        System.out.println("配菜为 ： name :" + name + "价格  ：" + price);
    }
}
