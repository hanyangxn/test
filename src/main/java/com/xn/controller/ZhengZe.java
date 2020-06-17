package com.xn.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2018/1/15.
 */
public class ZhengZe {
    public static void main(String[] args) {
        checkInt1to11("123 ");
    }
    public static boolean checkInt1to11(String str){
        //正则规则
        Pattern pattern=Pattern.compile("^[0-9]{1,11}+$");
        //被校验的字符串
        Matcher match=pattern.matcher(str);
        return match.matches();
    }
}
