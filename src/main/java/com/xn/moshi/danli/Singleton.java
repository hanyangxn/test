package com.xn.moshi.danli;

/**
 * Created by Administrator on 2019/1/24.
 */
public class Singleton {

    public static Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance==null){
            return new Singleton();
        }
        return instance ;
    }

    public void show(){
        System.out.println("Singleton Mode 【单例模式】 !");
    }
}