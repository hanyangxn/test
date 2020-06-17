package com.xn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by Administrator on 2018/10/22.
 */
@Controller
@RequestMapping("file")
public class UploadFile {

    @RequestMapping("uploadFile")
    public void downloadCusStopWord(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String fileName="123.txt";
        File file = ResourceUtils.getFile("classpath:excelTemplate/cusstopword.txt");
        if(file.exists()){
            FileWriter fw=new FileWriter(file);
            fw.write("你好！");
            fw.close();
        }
        response.setContentType("application/force-download");
        response.setHeader("Content-Disposition",
                "attachment;fileName=" + fileName);
        FileInputStream fst= new FileInputStream(file);
//        FileOutputStream fos=new FileOutputStream(str2);
        OutputStream outputStream = response.getOutputStream();
        int len=0;
        while ((len=fst.read())!=-1){
            outputStream.write(len);
        }
        outputStream.close();

    }
}
