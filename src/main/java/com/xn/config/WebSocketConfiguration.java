//package com.xn.config;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.converter.MessageConverter;
//import org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver;
//import org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler;
//import org.springframework.messaging.simp.config.ChannelRegistration;
//import org.springframework.messaging.simp.config.MessageBrokerRegistry;
//import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
//
//import java.util.List;
//
///**
// * WebSocket服务配置
// *
// * @author Jiangsl
// * @date 2019/03/12
// */
//@Configuration
//@EnableWebSocketMessageBroker
//public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {
//
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
//        stompEndpointRegistry.addEndpoint("/xbot")
//                .setAllowedOrigins("*");
//    }
//
//    @Override
//    public void configureWebSocketTransport(WebSocketTransportRegistration registration) {
//        registration.setSendTimeLimit(10 * 1000);
//        registration.setSendBufferSizeLimit(128 * 1024);
//        registration.setMessageSizeLimit(16 * 1024);
//    }
//
//    @Override
//    public void configureClientInboundChannel(ChannelRegistration registration) {
//        registration.taskExecutor().corePoolSize(100);
//    }
//
//    @Override
//    public void configureClientOutboundChannel(ChannelRegistration registration) {
//        registration.taskExecutor().corePoolSize(100);
//    }
//
//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> list) {
//
//    }
//
//    @Override
//    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> list) {
//
//    }
//
//    @Override
//    public boolean configureMessageConverters(List<MessageConverter> list) {
//        return false;
//    }
//
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry registry) {
//        // 定义用于心跳检测的调度器
//        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
//        taskScheduler.initialize();
//
//        registry.setApplicationDestinationPrefixes("/app");
//        registry.enableSimpleBroker("/tibot",
//                "/topic", "/queue", "/chat")
//                // 心跳设置，具体解释见
//                // 1) setTaskScheduler 方法的javadoc
//                // 2) https://docs.spring.io/spring/docs/5.1.5.RELEASE/spring-framework-reference/web.html#websocket-stomp-handle-simple-broker
//                // 3) http://stomp.github.io/stomp-specification-1.2.html#Heart-beating
//                .setTaskScheduler(taskScheduler);
//        registry.setCacheLimit(20000);
//    }
//}
