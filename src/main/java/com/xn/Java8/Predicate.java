package com.xn.Java8;

@FunctionalInterface
public interface Predicate<T> {
    Boolean test(T t);
}
