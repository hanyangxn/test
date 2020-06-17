package com.xn.util;

/**
 * Created by Administrator on 2018/1/30.
 */
public class User {
    private String name;
    private String pass;
    private Integer age;
    private String msg;

    public User(String name, String pass, Integer age, String msg) {
        this.name = name;
        this.pass = pass;
        this.age = age;
        this.msg = msg;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", age=" + age +
                ", msg='" + msg + '\'' +
                '}';
    }
}
