package com.yiwang.javalearningbasic.day21IOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArraySteam {
    public static void main(String[] args){
        //数据源
        ByteArrayInputStream bis = new ByteArrayInputStream("abcde".getBytes());
        //数据目的
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        int by = 0;
        while((by = bis.read())!=-1){
            bos.write(by);
        }
        System.out.println(bos.size());
        System.out.println(bos.toString());
//        bos.writeTo(new FileOutputStream("a.txt"));
    }
}
