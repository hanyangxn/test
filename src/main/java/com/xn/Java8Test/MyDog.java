package com.xn.Java8Test;

import org.apache.poi.ss.formula.functions.T;

@FunctionalInterface
public interface MyDog <T>{
    boolean query(T t);
}
