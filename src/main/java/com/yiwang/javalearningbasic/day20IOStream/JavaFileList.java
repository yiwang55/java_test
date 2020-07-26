package com.yiwang.javalearningbasic.day20IOStream;

import com.yiwang.javalearningbasic.SOP;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class JavaFileList extends SOP {
    public static void main(String[] args){
        File dir = new File("C:\\Users\\yiwang\\Desktop\\java_test\\javaTest");
    List<File> list = new ArrayList<File>();

    fileToList(dir,list);
    sop(list.size());


    File f = new File("path.txt");
    writeToFile(list,f);
    }
    public static void writeToFile(List<File> list,File javaListFile){
        BufferedWriter bufw = null;
        try{
            bufw = new BufferedWriter(new FileWriter(javaListFile));
            for(File f: list){
                String path = f.getAbsolutePath();
                bufw.write(path);
                bufw.newLine();
                bufw.flush();
            }
        }catch (Exception e){

        }finally{
            try{
                if (bufw != null)
                        bufw.close();

            }catch (Exception e){

            }
        }
    }
    public static void fileToList(File dir, List<File> list){
        File[] files = dir.listFiles();
        for (File file : files){
            if (file.isDirectory()){
                fileToList(file,list);
            }else
            {
                if(file.getName().endsWith(".java"))
            list.add(file);
            }
        }
    }
}
