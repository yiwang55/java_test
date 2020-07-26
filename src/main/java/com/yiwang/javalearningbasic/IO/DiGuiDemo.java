package com.yiwang.javalearningbasic.IO;

import java.io.File;

public class DiGuiDemo {

    public static void showJavaFile(File file){
        File[] files = file.listFiles();
        for (File f1: files){
            if (f1.isDirectory()){
                showJavaFile(f1);
            } else if(f1.getName().endsWith(".java")){
                System.out.println(f1.getAbsolutePath());
            }
        }
    }
    public static void main(String[] args) {
        File file = new File("D:\\Report-Builder\\analyticsapi");
        showJavaFile(file);

    }
}
