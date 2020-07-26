package com.yiwang.javalearningbasic.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("fw.txt")));
        String s = null;
        while((s = bufr.readLine()) != null){
        System.out.println(s);
        }
        bufr.close();
    }
}
