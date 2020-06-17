package com.xn.service.impl;

import com.xn.dao2.UserDao2;
import com.xn.pojo.User;
import com.xn.service.UserTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/6/5.
 */
@Service
public class UserServiceImpl2 implements UserTwoService {
    @Autowired
    private UserDao2 dao;

    @Override
    public List<User> getList() {
        return dao.findAll();
    }
}
