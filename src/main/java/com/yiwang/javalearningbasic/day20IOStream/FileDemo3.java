package com.yiwang.javalearningbasic.day20IOStream;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args){
        File dir = new File("D:\\java");
        showDir(dir);
    }
    public static void showDir(File dir){
        File[] files = dir.listFiles();
        for (File f: files){
            if(f.isDirectory()){
                showDir(f);
            }
            System.out.println(f);
        }
    }
}
