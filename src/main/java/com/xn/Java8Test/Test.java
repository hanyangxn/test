package com.xn.Java8Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    private static List<Dog> queryDog(List<Dog> list, MyDog<Dog> dog) {
        return list.stream().filter(s -> dog.query(s)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>(10);
        list = Arrays.asList(new Dog("泡泡", 1), new Dog("多多", 3), new Dog("旺旺", 7));
        List<Dog> dogs = queryDog(list, dog -> dog.getAge() > 1);
        System.out.println(dogs);
    }
}
