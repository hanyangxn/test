package com.xn.test;

import com.xn.sync.Task;

/**
 * Created by Administrator on 2018/11/19.
 */
public class HelloTest {
    public static void main(String[] args) throws Exception {
        Halp halp=new Halp();
        Hello hello = halp.instanceTaskObj();
        hello.sang("沙漠骆驼");
    }
}
