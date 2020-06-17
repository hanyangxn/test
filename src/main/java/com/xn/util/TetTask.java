package com.xn.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/9/14.
 */
public class TetTask {
    public static void main(String[] args) {
//        List<Task> list=new ArrayList<>();
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
        service.scheduleAtFixedRate(new Task1(), 10, 2, TimeUnit.SECONDS);
        service.shutdown();
        System.out.println();
    }

}
