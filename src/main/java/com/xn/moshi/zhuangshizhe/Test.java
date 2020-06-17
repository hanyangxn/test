package com.xn.moshi.zhuangshizhe;

/**
 * Created by Administrator on 2019/1/3.
 */
public class Test {
    public static void main(String[] args) {
        Coffee coffee=new SimpleCoffee();
        coffee=new MilkDecorator(coffee);
        coffee=new SugerDecorator(coffee);
        System.out.println("最终咖啡价格："+coffee.getPrice());
        System.out.println("最终咖啡口味：\n");
        coffee.getTaste();

    }
}
