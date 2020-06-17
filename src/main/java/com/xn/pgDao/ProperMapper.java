package com.xn.pgDao;

import com.xn.entity.People;

import java.util.List;

/**
 * Created by Administrator on 2018/12/6.
 */

public interface ProperMapper {
    List<People> getAll();

    People getOne();

    void insert(People people);

    void update(People people);

    void delete(int id);
}
