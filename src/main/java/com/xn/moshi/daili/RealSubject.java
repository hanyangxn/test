package com.xn.moshi.daili;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("你死了吗");
    }
}
