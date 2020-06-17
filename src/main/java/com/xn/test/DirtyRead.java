package com.xn.test;

/**
 * Created by Administrator on 2018/3/30.
 */
public class DirtyRead {
    private String username="zhangsan";
    private String password="123";

   public  synchronized void setValue(String username,String password){
       this.username=username;
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       this.password=password;
       System.out.println("setValue最终结果 ,username = "+username+" , password = "+password);
   }
   public synchronized void getValue(){
       System.out.println("getValue最终结果 ,username = "+username+" , password = "+password);
   }

    public static void main(String[] args) throws Exception {
        final DirtyRead dr=new DirtyRead();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                dr.setValue("lisi","345");
            }
        });
        t1.start();
        Thread.sleep(1000);
        dr.getValue();

    }
}
