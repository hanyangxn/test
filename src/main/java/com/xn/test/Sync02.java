package com.xn.test;

/**
 * Created by Administrator on 2018/3/30.
 */
public class Sync02 {
    static class Main{
        public int i=10;
        public synchronized void opertionSup(){
            try {
                i--;
                System.out.println("Main print i="+i);
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static class Sub extends Main{
        public synchronized void opertionSub(){
                try {
                    while (i>0){
                        i--;
                        System.out.println("Sub print i ="+i);
                    Thread.sleep(200);
                    this.opertionSup();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                Sub sub=new Sub();
                sub.opertionSub();
            }
        });
        thread.start();
    }
}
