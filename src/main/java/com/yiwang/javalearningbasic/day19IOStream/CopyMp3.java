package com.yiwang.javalearningbasic.day19IOStream;

import java.io.*;

/**
 * Created by yiwang on 2018/6/25.
 */
public class CopyMp3 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        copy_1();
        long end  = System.currentTimeMillis();
        System.out.println((end - start) +"毫秒");
    }

    public static void copy_1() throws IOException {
        BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("0.mp3"));
        BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream("1.mp3"));

        int by = 0;
        while((by = bufis.read()) != -1){
            bufos.write(by);
        }
        bufis.close();
        bufos.close();
    }
}