package com.xn.shejimoshi.gongchang;

//具体产品1：实现抽象产品中的抽象方法
class ConcreteProduct1 implements Product
{
    @Override
    public void show()
    {
        System.out.println("具体产品1显示...");
    }
}