package com.yiwang.javalearningbasic.IO;

import java.io.File;
import java.io.FilenameFilter;

public class FileListDemo {
    public static void main(String[] args) {
        File file = new File("D:\\");

        File[] files = file.listFiles();

        File[] files2 = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return false;
            }
        });
        int folderNum = 0;
        for (File f : files){
            if (f.isFile()){
                System.out.println(f.getName());
            }else {
                folderNum++;
            }
        }
        System.out.println("folderNum:"+ folderNum);
    }
}
