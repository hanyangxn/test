package com.xn.test;

/**
 * Created by Administrator on 2018/3/30.
 */
public class Sync01 {
    public synchronized void method1() throws Exception {
        System.out.println("method....1");
        Thread.sleep(2000);
        method2();
    }

    public synchronized void method2(){
        System.out.println("method.....2");
        method3();
    }

    public synchronized void method3(){
        System.out.println("method.....3");
    }

    public static void main(String[] args) {
       final Sync01 sync=new Sync01();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sync.method1();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
