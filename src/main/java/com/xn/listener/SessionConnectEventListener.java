//package com.xn.listener;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.ApplicationListener;
//import org.springframework.stereotype.Component;
//
///**
// * Websocket 建立连接后，当客户端发送 STOMP connect 命令时触发该事件
// * @author 侯法超
// * @date 2019/03/13
// */
//@Component
//public class SessionConnectEventListener implements ApplicationListener<SessionConnectEvent> {
//
//    private Logger logger = LoggerFactory.getLogger(SessionConnectEventListener.class);
//
//
//
//    @Override
//    public void onApplicationEvent(SessionConnectEvent event) {
//
//        logger.info("WebSocket connected"); // TODO 这个日志需要加上是哪个服务器连接上了
//
//    }
//
//
//}
