package com.yiwang.javalearningbasic.day19IOStream;

import com.yiwang.javalearningbasic.SOP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by yiwang on 2018/6/24.
 */
public class BufferedReaderDemo extends SOP {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("buf.txt");
        BufferedReader bufr = new BufferedReader(fr);

        String s1 = null;
        while((s1 = bufr.readLine()) != null){
            sop(s1);
        }
    bufr.close();
        }
}
