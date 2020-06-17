package com.xn.util;

/**
 * Created by Administrator on 2019/1/12.
 */
public class Test123 {
    public static void main(String[] args) {
        String name="有以下选项，请选择：&lt;enum_value_list&gt;";
        name=name.replaceAll("&lt;","<").replaceAll("&gt;",">");
        System.out.println(name);
    }
}
