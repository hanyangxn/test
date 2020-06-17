package com.xn.moshiTest.zuhe.test;

import com.xn.moshiTest.zuhe.Articles;

import java.util.ArrayList;
import java.util.List;

public class Bottom implements HotPot {
    private String name;
    private float price;

    private List<HotPot> hotPotList = new ArrayList<>();

    public Bottom(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public void add(HotPot hot) {
        hotPotList.add(hot);
    }

    @Override
    public float price() {
        for (Object pot : hotPotList) {
            price += ((HotPot)pot).price();
        }
        return price;
    }

    @Override
    public void show() {
        System.out.println("锅底为 ："+name+", 价格为 ：" +price);
        for (Object obj : hotPotList) {
            ((HotPot) obj).show();
        }
    }
}
