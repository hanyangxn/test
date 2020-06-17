package com.xn.moshiTest.zuhe.test;

public class Clinet {
    public static void main(String[] args) {
        Bottom bottom = new Bottom("王婆大虾",15);
        Bottom bottom1 = new Bottom("羊蝎子",20);

        Garnish muer = new Garnish("木耳", 12);
        Garnish doufu = new Garnish("豆腐", 15);
        bottom.add(muer);
        bottom.add(doufu);
        bottom.add(bottom1);

        Garnish yachang = new Garnish("鸭肠", 12);
        Garnish kuanfen = new Garnish("宽粉", 15);
        bottom1.add(yachang);
        bottom1.add(kuanfen);

        System.out.println("您选购的商品有：");
        bottom.show();

        float price = bottom.price();
        System.out.println("您要支付的价格："+ price);
    }
}
