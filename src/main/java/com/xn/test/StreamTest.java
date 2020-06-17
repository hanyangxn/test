package com.xn.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/2/5.
 */
public class StreamTest {
    public static void main(String[] args) {
        String str="zham,sh,dhfo,fdf,213qwe,e2,e231, ,";
        List<String> list = Arrays.asList(str.split(","));
        List<String> list1 = Arrays.asList(str.split(",")).stream().collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list1);

    }
}
