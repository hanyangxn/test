package com.xn.dao2;

/**
 * Created by Administrator on 2018/6/5.
 */
import com.xn.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2018/6/5.
 */
public interface UserDao2 extends JpaRepository<User,Integer> {
    List<User> findAll();
}