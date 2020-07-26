package com.yiwang.javalearningbasic.day18System;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by yiwang on 2018/6/24.
 */
public class CopyText {
    public static void main(String[] args) throws IOException{
copy_2();
    }

    public static void copy_1() throws IOException{
        FileWriter  fw = new FileWriter("./src/com/java/day18System/DateDemo.txt");

        FileReader fr = new FileReader("./src/com/java/day18System/DateDemo.java");

        int ch = 0;
        while ((ch = fr.read()) != -1){
            fw.write(ch);
        }

        fw.close();
        fr.close();
    }public static void copy_2() throws IOException{
        FileWriter  fw = null;
        FileReader fr = null;
        try{

            fw = new FileWriter("./src/com/java/day18System/RunTimeDemo.txt");
            fr = new FileReader("./src/com/java/day18System/RunTimeDemo.java");
            char[] buf = new char[1024];
            int num = 0;
            while((num = fr.read(buf)) != -1){
                fw.write(buf,0,num);
            }
        }catch (IOException e){
        throw new RuntimeException("读写失败");
        }finally{
            if(fw != null){
                try{
                    fw.close();
                }catch (IOException e){
                    e.toString();
                }
            }
            if(fr != null){
                try{
                    fr.close();
                }catch (IOException e){
                    e.toString();
                }
            }
        }

    }
}
