package com.yiwang.javalearningbasic.IO;

import java.io.*;

public class FiveWayToCopyFileDemo {
    public static void main(String[] args) throws IOException {
        String srcString = "D:\\var\\demo\\a.txt";
        String destString = "D:\\var\\demo\\b.txt";
//        method1(srcString, destString);
//        method2(srcString, destString);
//        method3(srcString, destString);
//        method4(srcString, destString);
        method5(srcString, destString);
    }

    private static void method5(String src, String dest)throws IOException {
        BufferedReader bufr = new BufferedReader(new FileReader(src));
        BufferedWriter bufw =  new BufferedWriter(new FileWriter(dest));
        String s = null;
        while((s = bufr.readLine()) != null){
            bufw.write(s);
            bufw.newLine();
            bufw.flush();
        }
        bufw.close();
        bufr.close();
    }
    //字符流缓冲区读写字符数组
    private static void method4(String src, String dest) throws IOException {
        BufferedReader bufr = new BufferedReader(new FileReader(src));
        BufferedWriter bufw =  new BufferedWriter(new FileWriter(dest));
        char[] chars = new char[1024];
        int ch =0;
        while((ch = bufr.read(chars)) != -1){
            bufw.write(chars, 0, ch);
            bufw.flush();
        }
        bufw.close();
        bufr.close();
    }
    //字符流缓冲区读写
    private static void method3(String src, String dest) throws IOException {
        BufferedReader bufr = new BufferedReader(new FileReader(src));
        BufferedWriter bufw =  new BufferedWriter(new FileWriter(dest));
        int ch =0;
        while((ch = bufr.read()) != -1){
            bufw.write(ch);
            bufw.flush();
        }
        bufw.close();
        bufr.close();
    }

    //字符流一次读写一个字符数组
    private static void method2(String src, String dest) throws IOException {
        FileReader fr = new FileReader(src);
        FileWriter fw = new FileWriter(dest);
        int len =0;
        char[] chars = new char[1024];
        while((len = fr.read(chars)) != -1){
            fw.write(chars, 0, len);
            fw.flush();
        }
        fr.close();
        fw.close();
    }

    //字符流一次读写一个字符
    private static void method1(String src, String dest) throws IOException {
        FileReader fr = new FileReader(src);
        FileWriter fw = new FileWriter(dest);
        int ch =0;
        while((ch = fr.read()) != -1){
            fw.write(ch);
            fw.flush();
        }
        fr.close();
        fw.close();
    }
}
