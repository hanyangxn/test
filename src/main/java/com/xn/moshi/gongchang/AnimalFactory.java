package com.xn.moshi.gongchang;

/**
 * Created by Administrator on 2019/1/24.
 */

public class AnimalFactory implements IAninmalFactory{

    private IAminmal aminmal = null;
    @Override
    public  IAminmal createAnimal(String name) {
        if(name.equals("Dog")){
            aminmal = new Dog();
        }
        if(name.equals("Cat")){
            aminmal = new Cat();
        }
        if(name.equals("Pig")){
            aminmal = new Pig();
        }
        //1.返回对应的小动物的接口实现的实例
        //2.对于内部（生产者）而言，具体生产哪一个动物，是封装好的，已经细化过了
        //3.对于外部（消费者）而言，我们只要告诉当前的工厂，我们需要哪一个动物就行，生产细节无需关心
        return aminmal;
    }
}
