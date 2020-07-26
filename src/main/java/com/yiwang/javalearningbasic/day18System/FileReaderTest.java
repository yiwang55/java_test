package com.yiwang.javalearningbasic.day18System;

import com.yiwang.javalearningbasic.SOP;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by yiwang on 2018/6/23.
 */
public class FileReaderTest extends SOP {
public static void main(String[] args) throws IOException{
    FileReader fr = new FileReader("./src/com/java/day18System/DateDemo.java");
    char[] buf = new char[1024];
    int num =0;
    while((num = fr.read(buf)) != -1){
        sop(new String(buf,0,num));
    }
    fr.close();
}
}
