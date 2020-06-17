package com.xn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskController {
    //这个就是我们可以指定频道推送对应数据的对象
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @Scheduled(cron = "*/10 * * * * ?")//运行周期时间可配
    public void publicMarketValueMessage() {
        //这里的nowDate 暂且作为订阅的内容--可更换为具体的业数据
        DateFormat dateFormat=new SimpleDateFormat();
        String nowDate = dateFormat.format(new Date());
        //这里的destination 是 订阅的地址
        String destination = "/topic/echoTest/price";
        System.out.println("websocket 【{}】定时任务发布消息==>【开始】"+ destination);
        try {
            this.simpMessagingTemplate.convertAndSend(destination, nowDate);
        }catch (Exception e){
            System.out.println("websocket ={} 定时任务发布消息==>【异常】"+destination);
        }
    }
}
