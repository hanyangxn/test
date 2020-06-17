package com.xn.controller;





import com.xn.util.ThreadPool;
import com.xn.util.ThreadUtil;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/6/25.
 */
public class ThreadTest {
    public static void main(String[] args) {
        //利用它可以实现类似计数器的功能
        CountDownLatch latch=new CountDownLatch(3);
        ThreadPool threadPool = ThreadPool.init();
        for (int i = 0; i < 3; i++) {
            ThreadUtil threadUtil=new ThreadUtil(latch,"hello");
            threadPool.execute(threadUtil);
        }
        threadPool.shutdown();
        try {
            threadPool.awaitTermination(500, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
