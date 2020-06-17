package com.xn.test;

/**
 * Created by Administrator on 2018/3/29.
 */
public class XianCheng extends Thread{
    /*线程基础一*/
    private int count=5;
    public synchronized void  run(){
        count--;
        System.out.println(this.currentThread().getName()+"  count = "+count);
    }
    public static void main(String[] args) {
        XianCheng xh=new XianCheng();
        Thread th1=new Thread(xh,"t1");
        Thread th2=new Thread(xh,"t2");
        Thread th3=new Thread(xh,"t3");
        Thread th4=new Thread(xh,"t4");
        Thread th5=new Thread(xh,"t5");
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }


}
