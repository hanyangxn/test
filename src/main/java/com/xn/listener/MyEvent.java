package com.xn.listener;

import com.xn.pojo.User;
import com.xn.test6.Obj;
import org.springframework.context.ApplicationEvent;

import java.util.List;

/**
 * 自定义监听方法测试类
 */
public class MyEvent extends ApplicationEvent {


    private List<User> msg;

    /**
     * 在自定义事件的构造方法中除了第一个source参数，其他参数都可以去自定义，
     * 可以根据项目实际情况进行监听传参，这里就只定义个简单的String字符串的透传
     * @param source
     * @param msg
     */
    public MyEvent(Object source,List<User> msg) {
        super(source);
        this.msg = msg;
    }

    /**
     * 自定义监听器触发的透传打印方法
     * @param msg
     */
    public void printMsg(List<User> msg)
    {
        System.out.println("编程事件监听:" + msg);
    }

    public List<User> getMsg() {
        return msg;
    }

    public void setMsg(List<User> msg) {
        this.msg = msg;
    }
}
