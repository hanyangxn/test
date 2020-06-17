package com.xn.service.impl;

import com.xn.pojo.User;
import com.xn.service.UserService;
import com.xn.util.EnmuLei;
import org.springframework.context.ApplicationContext;

import javax.xml.ws.Service;
import java.util.List;

/**
 * Created by Administrator on 2018/2/6.
 */
public class AiFuZhi implements UserService {
    protected ApplicationContext ctx;
    private UserService service1;

    @Override
    public List<User> getList() {
        initWan();
        List<User> list = service1.getList();
        return list;
    }

    @Override
    public void getListener() {

    }

    private UserService initWan(){
        EnmuLei actionEnum = EnmuLei.geByName("ALIYUN");
        Class<?> actionClass = null;
        actionClass = actionEnum.getUserServiceImpl();
        Object obj = ctx.getBean(actionClass);
        service1=(UserService)obj;
        return  service1;
    }
}
