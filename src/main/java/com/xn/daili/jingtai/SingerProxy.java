package com.xn.daili.jingtai;

import org.springframework.beans.factory.annotation.Autowired;

public class SingerProxy implements ISinger {

    private ISinger iSinger;

    public SingerProxy(ISinger iSinger) {
        this.iSinger = iSinger;
    }

    @Override
    public void sing() {
        System.out.println("向观众问好");
        iSinger.sing();
        System.out.println("谢谢大家");
    }

    public static void main(String[] args) {
        Singer singer = new Singer();
        SingerProxy singerProxy = new SingerProxy(singer);
        singerProxy.sing();
    }

}
