package com.xn.test;

import java.io.FileInputStream;

public class FileType {
    private static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    /**
     * @param
     */
    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("D:\\项目图片\\2222.jpg");
        byte[] b = new byte[3];
        is.read(b, 0, b.length);
        String photo = bytesToHexString(b);
        photo = photo.toUpperCase();
        System.out.println("头文件是：" + photo);
        String ooo = TypeDict.checkType(photo);
        System.out.println("后缀名是：" + ooo);
    }
}
