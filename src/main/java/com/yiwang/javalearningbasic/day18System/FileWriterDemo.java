package com.yiwang.javalearningbasic.day18System;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by yiwang on 2018/6/23.
 */


public class FileWriterDemo {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("demo.txt");
        fw.write("abcde");
        fw.close();
//        fw.flush();
//
//        fw.write("haha");
//        fw.flush();

    }
}
