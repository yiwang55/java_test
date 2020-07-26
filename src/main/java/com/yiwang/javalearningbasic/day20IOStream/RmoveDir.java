package com.yiwang.javalearningbasic.day20IOStream;

import java.io.File;

public class RmoveDir {
    public static void main(String[] args){
        File f = new File("D:\\test\\ttest");
        removeDir(f);
    }
    public static void removeDir(File dir){
        File[] files = dir.listFiles();
        for(File f : files){
            if(f.isDirectory()){
                removeDir(f);
            }
            else
            f.delete();
            dir.delete();
        }
    }
}
