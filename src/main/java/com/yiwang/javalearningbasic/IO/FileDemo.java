package com.yiwang.javalearningbasic.IO;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
//        File file = new File("D:\\var\\demo");
//        System.out.println("mkdir:" + file.mkdir());
//
//        File file1 = new File("D:\\var\\demo\\a.txt");
//        try {
//            System.out.println("create New file" + file1.createNewFile());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        File file = new File("D:\\var\\demo\\test\\test");
        System.out.println(file.mkdirs());
    }
}
