
package com.xn.controller;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


/**
 * Created by Administrator on 2018/1/3.
 */

public class ZiJie {
    public static void main(String[] args) throws Exception {
      String str="D://haha.txt";
      String str2="D://output.txt";
      String s="   ";
        System.out.println("df"+s.trim());
      //copyFile2(str,str2);
    }
    public static  void copyFile1(String str1,String str2) throws Exception {
        FileInputStream fst= new FileInputStream(str1);
        FileOutputStream fos=new FileOutputStream(str2);
        int len=0;
        while ((len=fst.read())!=-1){
            System.out.println(len);
            fos.write(len);
        }
        fos.close();
        fst.close();
    }
    public static void copyFile2(String str1,String str2) throws Exception {
        FileInputStream fst=new FileInputStream(str1);
        FileOutputStream fos=new FileOutputStream(str2);
        int len=0;
        byte[] b=new byte[1024];
        while ((len=fst.read(b))!=-1){
            fos.write(len);
        }
        fos.close();
        fst.close();

    }
    // 方法三
    public static void copyFile3(String srcPath, String destPath) throws Exception {

        // 打开输入流
        FileInputStream fis = new FileInputStream(srcPath);
        // 打开输出流
        FileOutputStream fos = new FileOutputStream(destPath);

        // 读取和写入信息
        int len = 0;
        // 创建一个字节数组，当做缓冲区
        byte[] b = new byte[1024];
        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
        }

        // 关闭流  先开后关  后开先关
        fos.close(); // 后开先关
        fis.close(); // 先开后关

    }
}

