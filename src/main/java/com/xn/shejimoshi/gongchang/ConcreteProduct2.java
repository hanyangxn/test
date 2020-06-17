package com.xn.shejimoshi.gongchang;

//具体产品2：实现抽象产品中的抽象方法
class ConcreteProduct2 implements Product
{
    @Override
    public void show()
    {
        System.out.println("具体产品2显示...");
    }
}