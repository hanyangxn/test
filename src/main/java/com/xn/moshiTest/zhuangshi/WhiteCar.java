package com.xn.moshiTest.zhuangshi;

public class WhiteCar implements CarComponent{
    public WhiteCar() {
        System.out.println("开始组装车");
    }

    @Override
    public void operation() {
        System.out.println("组装白色的车");
    }
}
