package com.xn.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/8/10.
 */
public class Timer {
/*    Runnable runnable = new Runnable() {
        public void run() {
            // task to run goes here
            System.out.println("Hello !!");
        }
    };*/
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
//     第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
//    service.scheduleAtFixedRate(new Task(), 10, 1, TimeUnit.SECONDS);

}
