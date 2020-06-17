package com.xn.lambdaTest;

public interface Formula {
    double cal(int a);
    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
