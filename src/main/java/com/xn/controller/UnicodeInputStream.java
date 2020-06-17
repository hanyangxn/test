package com.xn.controller;
import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by Administrator on 2018/1/8.
 */
public class UnicodeInputStream  {
    public static String toHex(byte[] byteArray) {
        int i;
        StringBuffer buf = new StringBuffer("");
        int len = byteArray.length;
        for (int offset = 0; offset < len; offset++) {
            i = byteArray[offset];
            if (i < 0)
                i += 256;
            if (i < 16)
                buf.append("0");
            buf.append(Integer.toHexString(i));
        }
        return buf.toString().toUpperCase();
    }
    private static String getCharset(File fileName) throws IOException {
        BufferedInputStream bin = new BufferedInputStream(new FileInputStream(fileName));
        byte[] b = new byte[10];
        bin.read(b, 0, b.length);
        String first = toHex(b);
        //这里可以看到各种编码的前几个字符是什么，gbk编码前面没有多余的
        String code = null;
        if (first.startsWith("EFBBBF")) {
            code = "UTF-8";
        } else if (first.startsWith("FEFF00")) {
            code = "UTF-16BE";
        } else if (first.startsWith("FFFE")) {
            code = "Unicode";
        }else if (first.startsWith("E5AE")) {
            code = "UTF-8";
        } else {
            code = "GBK";
        }
        return code;
    }
}