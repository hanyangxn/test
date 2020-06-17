package com.xn.util;

import java.text.DecimalFormat;

/**
 * Created by Administrator on 2018/12/19.
 */
public class Test66 {

    private String format(float f) {
        DecimalFormat df = new DecimalFormat("#.00");
        String format = df.format(f);
        return format;
    }
    public static void main(String[] args) {
//        float f = 99.9999;
//        String format = format(f);
    }
}
