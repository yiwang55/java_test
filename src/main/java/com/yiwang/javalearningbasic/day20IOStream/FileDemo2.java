package com.yiwang.javalearningbasic.day20IOStream;

import com.yiwang.javalearningbasic.SOP;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by yiwang on 2018/7/4.
 */
public class FileDemo2 extends SOP {
    public static void main(String[] args){
    File dir = new File("c:\\");
        File[] files = dir.listFiles();
        for(File f : files){
            sop(f.getName()+"...."+f.length());
        }
//        listFilterDemo();
}
public static void listFilterDemo(){
    File f = new File("C:\\Users\\yiwang\\IdeaProjects\\javaTest\\src\\com\\java\\day19IOStream");
    String[] names = f.list(new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
//                if (name.endsWith(".java"))
//                return true;
//                return false;
            return name.endsWith(".txt");
        }
    });
    for(String name: names){
        sop(name);
    }
    }
    public static void listDemo(){
        File f= new File("c:\\");
        String[] names = f.list();
        for(String name : names){
            sop(name);
        }
    }
    public static void listRootsDemo(){
        File[] files= File.listRoots();
        for (File f : files){
            sop(f);
        }
    }
}
