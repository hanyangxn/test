package com.xn.tianrun;


import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zhengze {
    public static void main(String[] args) {
//        String str = "123213";

        // 根据以前的方法进行判断
        // System.out.println(str.equals("abc"));

        /**
         * 用正则表达式来判断
         * 1.compile(String regex)    将给定的正则表达式编译到模式中。
         * 2.matcher(CharSequence input)    创建匹配给定输入与此模式的匹配器。
         * 3.matches()    尝试将整个区域与模式匹配。
         */
        // 首先要编译正则规则形式
//        Pattern p = Pattern.compile("[\\u4e00-\\u9fff]{1,5}");
//        // 将正则进行匹配
//        Matcher m = p.matcher(str);
//        // 进行判断
//        boolean b = m.matches();
//        System.out.println(b);
//        Pattern p1 = Pattern.compile("[\u4e00-\u9fa5]");
//        Matcher m = p1.matcher(str);
//        System.out.println(m.find());
        String ad_sdf = cnToUnicode("_sss");
        String uu="1994-06-05<hello>";
        String s = uu.replaceAll("</?\\w+>", "");
        System.out.println(s);
//        System.out.println(uu.contains("INTENT_"));

//        if (m.find()) {
//            return true;
//        }
//        return false;
    }
    //unicode转成中文
    private static String unicodeToCn(String unicode) {
        /** 以 \ u 分割，因为java注释也能识别unicode，因此中间加了一个空格*/
        String[] strs = unicode.split("\\\\u");
        String returnStr = "";
        // 由于unicode字符串以 \ u 开头，因此分割出的第一个字符是""。
        for (int i = 1; i < strs.length; i++) {
            returnStr += (char) Integer.valueOf(strs[i], 16).intValue();
        }
        return returnStr;
    }
    //中文转成unicode
    private static String cnToUnicode(String cn) {
        char[] chars = cn.toCharArray();
        String returnStr = "";
        for (int i = 0; i < chars.length; i++) {
            returnStr += "\\u" + Integer.toString(chars[i], 16);
        }
        return returnStr;
    }

}
