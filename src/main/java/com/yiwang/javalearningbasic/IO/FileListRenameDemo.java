package com.yiwang.javalearningbasic.IO;

import java.io.File;
import java.io.FilenameFilter;

public class FileListRenameDemo {
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
                f.renameTo(new File(file,f.getName().replace("‐Meier Estimator - Survival Curve","")));
                System.out.println(f.getAbsoluteFile());
            }
        }
    }
}
