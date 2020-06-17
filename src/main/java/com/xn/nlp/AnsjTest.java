package com.xn.nlp;

import org.ansj.splitWord.analysis.ToAnalysis;

/**
 * Created by Administrator on 2018/4/27.
 */
public class AnsjTest {
    public static void main(String[] args) {
        String str = "你多大了" ;
        System.out.println(ToAnalysis.parse(str));
    }
}
