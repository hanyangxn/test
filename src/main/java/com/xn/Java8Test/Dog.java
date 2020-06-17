package com.xn.Java8Test;

import lombok.Data;

@Data
public class Dog {
    private String name;
    private Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
