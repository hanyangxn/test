package com.xn.test;

import com.xn.util.User;
import com.xn.util.User1;
import sun.applet.Main;

/**
 * Created by Administrator on 2018/1/30.
 */
public class WanTest {
    private String s(){
        User user=new User();
        User1 user1=new User1();
        user=setUser(user,user1);
        return  ss(user,user1);
    }
    private User setUser(User user, User1 user1){
        user.setName("zhangsan");
        user.setAge(12);
        user.setMsg("nidaue");
        user.setPass("123");
        user1.setDa("d");
        user1.setSan("s");
        return  user;
    }
    private String ss(User user,User1 user1){
        System.out.println(user);
        System.out.println(user1);
        return  "";
    }
    public static void main(String[] args) {
       WanTest w=new WanTest();
       w.s();
    }
}
