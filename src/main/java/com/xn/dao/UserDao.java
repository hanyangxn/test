package com.xn.dao;

import com.xn.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Administrator on 2018/1/2.
 */
public interface UserDao extends JpaRepository<User,Integer> {

    List<User> findAll();

 }
