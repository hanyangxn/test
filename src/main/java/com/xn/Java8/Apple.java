package com.xn.Java8;

import lombok.Data;

@Data
public class Apple {
    private String color;
    private int wight;

    public Apple(String color, int wight) {
        this.color = color;
        this.wight = wight;
    }

}
