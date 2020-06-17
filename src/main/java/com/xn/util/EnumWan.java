package com.xn.util;

/**
 * Created by Administrator on 2018/2/2.
 */
public enum EnumWan {
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
    // 成员变量
    private String name;
    private int index;
    private  String dd;
    // 构造方法

    EnumWan(String name, int index) {
        this.name = name;
        this.index = index;
    }

    //覆盖方法
    @Override
    public String toString() {
        return this.index+"_"+this.index;
    }
}
