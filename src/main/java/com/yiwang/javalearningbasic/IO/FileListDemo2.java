package com.yiwang.javalearningbasic.IO;

import java.io.File;
import java.io.FilenameFilter;

public class FileListDemo2 {
    public static void main(String[] args) {

        File file = new File("D:\\var\\log");

        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.startsWith("Kaplan")){
                    return true;
                }
                return false;
            }
        });
        for (File f : files){
            if (f.isFile()){
                System.out.println(f.getName());
            }
        }
    }
}