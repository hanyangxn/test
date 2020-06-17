package com.xn.test10;

/**
 * Created by Administrator on 2018/9/5.
 */
public class Factorial {
    //递归函数
    int fact(int n){
        if(n==1){
            return 1;
        }else{
            return fact(n-1)*n;
        }
    }
}
