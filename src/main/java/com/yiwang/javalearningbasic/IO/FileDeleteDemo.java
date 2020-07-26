package com.yiwang.javalearningbasic.IO;

import java.io.File;
import java.io.IOException;

public class FileDeleteDemo {
    public static void main(String[] args) {
        File file = new File("D:\\var\\demo\\test\\test.txt");
        File file2 = new File("D:\\var\\demo\\test");
        File file3 = new File("D:\\var\\demo\\test\\delete\\test");
        file2.mkdir();
        file3.mkdirs();
        try {
            System.out.println("create file:" + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("delete file:"+ file.delete());
        System.out.println("delete file2:"+ file2.delete());
        System.out.println("delete file3:"+ file3.delete());

    }
}
