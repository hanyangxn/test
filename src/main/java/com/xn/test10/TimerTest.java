//package com.xn.test10;
//
//import java.util.Timer;
//
//public class TimerTest  extends CommonTimerTask1 {
//
//
//    public TimerTest(UserSession userSession) {
//        super(userSession);
//    }
//
//    @Override
//    public void run() {
//        System.out.println("hahahaha");
//        userSession.getTimer().cancel();
//    }
//    public static void main(String[] args) {
//        Timer timer = new Timer();
//        UserSession userSession=new UserSession();
//        TimerTest timerTest=new TimerTest(userSession);
//        timer.schedule(timerTest,2000);
//        userSession.setTimer(timer);
//    }
//
//
//}
