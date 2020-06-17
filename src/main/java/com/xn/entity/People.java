package com.xn.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/12/6.
 */
public class People implements Serializable{
    private Integer id;
    private String name;
    private int age;
    private int isDel;
    private String sex;

    public People(Integer id, String name, int age, int isDel, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isDel = isDel;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
