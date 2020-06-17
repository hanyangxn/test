package com.xn.service.impl;

import com.xn.dao.UserDao;
import com.xn.listener.MyEvent;
import com.xn.pojo.User;
import com.xn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/1/2.
 */
@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserDao dao;
    /**
     *  上下文对象
     */
    @Resource
    private ApplicationContext applicationContext;

    @Override
    public List<User> getList() {
        List<User> all = dao.findAll();

        return all;
    }

    @Override
    public void getListener() {
        //通过上下文对象发布监听
        List<User> all = dao.findAll();
        applicationContext.publishEvent(new MyEvent(this,all));
        System.out.println("service被调用"+all);
    }

}
