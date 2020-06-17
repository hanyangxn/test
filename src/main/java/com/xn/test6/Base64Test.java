package com.xn.test6;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.NoSuchAlgorithmException;

public class Base64Test {
    public static void main(String[] args) throws Exception {
        String str="GETlocalhost:8080/tibotAccessKeyId=key&Expires=5&Timestamp=2019-07-02T15:53:38Z";
        String accessKeySecret ="secret";
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(accessKeySecret.getBytes("UTF-8"), "HmacSHA1"));
        byte[] signData = mac.doFinal(str.getBytes("UTF-8"));
        System.out.println(DatatypeConverter.printBase64Binary(signData));
//        String s = DatatypeConverter.printBase64Binary(str.getBytes());
//        System.out.println(s);
//R0VUbG9jYWxob3N0OjgwODAvdGlib3RBY2Nlc3NLZXlJZD1rZXkmRXhwaXJlcz01JlRpbWVzdGFtcD0yMDE5LTA3LTAyVDE1OjUzOjM4Wg==
//E6wvK9Yki/u55s456eKQ3SLIZN0=
    }
}
