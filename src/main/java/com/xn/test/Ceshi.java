package com.xn.test;

/**
 * Created by Administrator on 2018/8/10.
 */
public class Ceshi {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ceshi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
