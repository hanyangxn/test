package com.xn.shejimoshi.zuhe;

import javax.swing.*;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception {

        Class<?> aClass = Class.forName("test.Ceshi");
        Object o = aClass.newInstance();
        System.out.println(o);
//        Color color=new White();
//        GasolineCar car=new GasolineCar(color);
//        car.move();

        JFrame frame=new JFrame("我是你爸爸");
        frame.setSize(500,500);
        frame.getContentPane().setBackground(Color.RED);
        frame.setVisible(true);
        BufferedReader intep=new BufferedReader(new InputStreamReader(System.in));
        try{
           intep.readLine();
        } catch(IOException e){
            System.out.println("IOException");
        }

        System.exit(0);

    }
}
