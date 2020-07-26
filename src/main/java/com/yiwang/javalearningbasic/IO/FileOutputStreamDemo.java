package com.yiwang.javalearningbasic.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\var\\demo\\b.txt"));
            byte[] bytes = "hello world".getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
