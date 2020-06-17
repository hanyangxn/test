package com.xn.test6;

/**
 * Created by Administrator on 2018/12/29.
 */
public class User implements Obj {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String ss) {
        System.out.println(this.name+ss);
    }
}
