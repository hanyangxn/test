//package com.xn.listener;
//
//
//import com.sun.istack.internal.Nullable;
//import com.xn.tianrun.*;
//import lombok.NonNull;
//import org.apache.commons.lang3.StringUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
//import org.springframework.stereotype.Component;
//import org.springframework.web.socket.messaging.SessionSubscribeEvent;
//
//import java.util.List;
//import java.util.Map;
//
///**
// * @author houfc
// * @date 2019/03/14
// */
//@Component
//public class SessionSubscribeEventListener implements ApplicationListener<SessionSubscribeEvent> {
//
//    private Logger logger = LoggerFactory.getLogger(SessionSubscribeEventListener.class);
//
//    @Autowired
//    private UserSessionManager sessionManager;
//
//    @Autowired
//    private BotService botService;
//
//    @Override
//    public void onApplicationEvent(@NonNull SessionSubscribeEvent event) {
//        // 当 client 订阅时，将 构建UserSession加入 map
//        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
//        UserSession userSession = generateSession(headerAccessor);
//
//        // 当有订阅时，添加 userSessionMap 及 botSession redis // TODO
//        if (userSession != null) {
//            logger.debug("session subscribe event, userSession: {}", userSession);
//            sessionManager.set(userSession.getUniqueId(), userSession);
//            // 机器人注册后，开始主动握手计时
//            sessionManager.timerScheduleHello(userSession.getUniqueId());
//        } else {
//            logger.warn("session subscribe event error userSession, headerAccessor is: {}", headerAccessor);
//        }
//    }
//
//    /**
//     * 通过订阅事件获取 UserSession ，如果参数检验不通过，返回 null
//     * @param headerAccessor StompHeaderAccessor
//     * @return UserSession 如果参数检验不通过，返回 null
//     */
//    @Nullable
//    private UserSession generateSession(StompHeaderAccessor headerAccessor) {
//        String userId = getNativeHeader(headerAccessor, "userId");
//        String clientId = getNativeHeader(headerAccessor, "clientId");
//        String uniqueId = getNativeHeader(headerAccessor, "uniqueId");
//        String botId = getNativeHeader(headerAccessor, "botId");
//        String paramStr = getNativeHeader(headerAccessor, "params");
//
//        if (StringUtils.isEmpty(userId) || StringUtils.isEmpty(clientId)
//                || StringUtils.isEmpty(uniqueId) || StringUtils.isEmpty(botId)) {
//            return null;
//        }
//
//        Bot bot = botService.get(botId);
//        if (!userId.equals(bot.getUserId().toString())) {
//            return null;
//        }
//
//        // 校验通过进行组装
//        UserSession userSession = new UserSession();
//        userSession.setUniqueId(uniqueId);
//        userSession.setUserId(Integer.valueOf(userId));
//        userSession.setClientId(clientId);
//        userSession.setBotId(botId);
//        userSession.setWebSocketSessionId(headerAccessor.getSessionId());
//        userSession.setSubscriptionId(headerAccessor.getSubscriptionId());
//        if (paramStr != null) {
//            userSession.setParams(JsonUtils.readValue(paramStr, Map.class));
//        }
//
//        return userSession;
//    }
//
//    @Nullable
//    private String getNativeHeader(StompHeaderAccessor headerAccessor, String headerName) {
//        List<String> headerValues = headerAccessor.getNativeHeader(headerName);
//        if (headerValues != null && headerValues.size() > 0) {
//            return headerValues.get(0);
//        }
//        return null;
//    }
//}
