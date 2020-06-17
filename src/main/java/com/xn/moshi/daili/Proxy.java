package com.xn.moshi.daili;

public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("临死之前");
        realSubject.request();
        System.out.println("已经死亡");
    }
}
