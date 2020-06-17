package com.xn.controller;


import java.io.*;


/**
 * Created by Administrator on 2018/1/3.
 */
//导入

public class Zifu {
    public static void main(String[] args) {
        File writeName = new File("D://output.txt");
        if (!writeName.exists()) {
            try {
                writeName.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter fw = null;
        try {
            fw = new FileWriter(writeName,true);
            String pathName = "D://haha.txt";
            File fileName = new File(pathName);
            InputStreamReader reader = null;
            reader = new InputStreamReader(new FileInputStream(fileName),"gbk");
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println("读出来的为----------------》"+line);
                fw.write(line+"\r\n");
                fw.flush();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
                if (fw != null) {
                    try {
                        fw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                }
        }

    }

/*
 File writeName=new File("D://output.txt");
        if (!writeName.exists()){
            try {
                writeName.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                BufferedWriter bw=new BufferedWriter(new FileWriter(writeName));
                bw.write("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/


    }
}

