package com.xn.test;

/**
 * Created by Administrator on 2018/3/29.
 */
public class XianCheng2{
        private  static int num=0;
        public static synchronized void  printNum(String tag){
            try {
                if (tag.equals("a")) {
                    num = 100;
                    System.out.println("tag a, set num over!");
                    Thread.sleep(1000);
                }else {
                    num=200;
                    System.out.println("tag b, set num over!");
                }
                System.out.println("tag = "+tag+", num = "+num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        public static void main(String[] args) {
            XianCheng2 xn1=new XianCheng2();
            XianCheng2 xn2=new XianCheng2();
            Thread t1=new Thread(new Runnable() {
                @Override
                public void run() {
                    xn1.printNum("a");
                }
            });
            Thread t2=new Thread(new Runnable() {
                @Override
                public void run() {
                    xn2.printNum("b");
                }
            });
            t1.start();
            t2.start();
        }
}
