package com.xn.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static List<Apple> filterApple(List<Apple> appleList, Predicate<Apple> predicate){
        List<Apple> apples = new ArrayList<>();
        for (Apple apple : appleList) {
            if(predicate.test(apple)){
                apples.add(apple);
            }
        }
        return apples;
    }
    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(new Apple("RED", 80),
                new Apple("GREEN", 100),
                new Apple("BLACK", 150));
        // 重量大于100
        List<Apple> filterApple = filterApple(appleList, apple -> apple.getWight() > 100);
        System.out.println("重量大于100"+filterApple);
        // 红色的苹果
        filterApple = filterApple(appleList, apple -> apple.getColor().equals("RED"));
        System.out.println("红色的苹果"+filterApple);

    }
}
