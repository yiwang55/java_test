package com.yiwang.javalearningbasic.day19IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by yiwang on 2018/6/24.
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("buf.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int x = 0; x<10;x++){
            bw.write("abcdef"+x);

            bw.newLine();///跨平台换行符
        }
        bw.flush();
        bw.close();
    }
}
