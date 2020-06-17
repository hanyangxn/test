package com.xn.util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2018/6/25.
 */
public class ThreadUtil implements Runnable{
    Logger log = LoggerFactory.getLogger(ThreadUtil.class);
    private CountDownLatch latch;
    private String msg;

    public ThreadUtil(CountDownLatch latch, String msg) {
        this.latch = latch;
        this.msg = msg;
    }

    @Override
    public void run() {
       try {
           syno_works();
       }catch (Exception e){
           log.info("*****************多线程同步问答对错误****************:{}", e.getMessage());
       }finally {
           latch.countDown();
       }
    }
    public ResponseData syno_works(){
        System.out.println(this.msg+new Thread().getName()+"----------------------->运行了");
        return ResponseData.ok().putDataValue("msg","dsfs");
    }
}
