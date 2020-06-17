package com.xn.AccessKeyEncoder;

import java.util.Random;

public class AccessKeyEncoder {

    private static final int ACCESS_KEY_ID_SIZE = 20;
    private static final int ACCESS_KEY_SECRET_SIZE = 32;

    public static String getAccessKeyId() {
        StringBuilder accessKeyId = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < ACCESS_KEY_ID_SIZE; i++) {
            // 输出字母还是数字
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            if ("char".equalsIgnoreCase(charOrNum)){
                //指定是大写的字母
                int choice = 65;
                accessKeyId.append((char) (choice + random.nextInt(26)));
            }
            if ("num".equalsIgnoreCase(charOrNum)) {
                accessKeyId.append(String.valueOf(random.nextInt(10)));
            }
        }
        return accessKeyId.toString();
    }

    public static String getAccessKeySecret() {
        StringBuilder accessKeySecret = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < ACCESS_KEY_SECRET_SIZE; i++) {
            // 输出字母还是数字
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            if ("char".equalsIgnoreCase(charOrNum)) {
                //指定是大写的字母
                int choice = 97;
                accessKeySecret.append((char) (choice + random.nextInt(26)));
            }
            if ("num".equalsIgnoreCase(charOrNum)) {
                accessKeySecret.append(String.valueOf(random.nextInt(10)));
            }
        }
        return accessKeySecret.toString();
    }
}
