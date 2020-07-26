package com.yiwang.javalearningbasic.IO;

import java.io.*;

public class CopyPicDemo {
    public static void main(String[] args) throws IOException {
        String srcString = "D:\\var\\demo\\1.jpg";
        String destString = "D:\\var\\demo\\lake tahoe.jpg";

//        method1(srcString, destString);
//        method2(srcString, destString);
//        method3(srcString, destString);
        method4(srcString, destString);
    }

    private static void method4(String srcString, String destString) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));
        int by = 0;
        byte[] bytes = new byte[1024];
        while((by = bis.read(bytes)) != -1){
            bos.write(bytes, 0, by);
            bos.flush();
        }
        bos.close();
        bis.close();
    }

    private static void method3(String srcString, String destString) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));
        int by = 0;
        while((by = bis.read()) != -1){
            bos.write(by);
            bos.flush();
        }
        bos.close();
        bis.close();
    }

    private static void method2(String srcString, String destString) throws IOException {
        FileInputStream fis = new FileInputStream(srcString);
        FileOutputStream fos  = new FileOutputStream(destString);
        byte[] bytes = new byte[1024];
        int read = 0;
        while((read = fis.read(bytes)) != -1){
            fos.write(bytes, 0, read);
            fos.flush();
        }
        fos.close();
        fis.close();
    }
    private static void method1(String srcString, String destString) throws IOException {
        FileInputStream fis = new FileInputStream(srcString);
        FileOutputStream fos  = new FileOutputStream(destString);
        int read = 0;
        while((read = fis.read()) != -1){
            fos.write(read);
            fos.flush();
        }
        fos.close();
    }
}
