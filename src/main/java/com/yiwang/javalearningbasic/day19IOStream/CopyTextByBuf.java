package com.yiwang.javalearningbasic.day19IOStream;

import java.io.*;

/**
 * Created by yiwang on 2018/6/24.
 */
public class CopyTextByBuf {
    public static void main(String[] args){
        BufferedReader bufr = null;
        BufferedWriter bufw = null;
        try{
            bufr  = new BufferedReader(new FileReader("./src/com/java/day19IOStream/BufferedWriterDemo.java"));
            bufw = new BufferedWriter(new FileWriter("BufferedWriterDemo_Copy.txt"));
            String line = null;
            while(bufr.readLine() != null){
               line =  bufr.readLine();
               bufw.write(line);
               bufw.newLine();
            }
        }catch (IOException e){
            throw new RuntimeException("读写失败");
        }finally{
            try{
                if(bufw != null)
                bufw.close();
                if(bufr != null)
                    bufr.close();

            }catch (IOException e){

            }
        }

    }
}