package com.yiwang.javalearningbasic.day21IOStream;

import java.io.*;

public class EncodeStream {
    public static void main(String[] args) throws IOException{
        readText();
    }
    public static void readText() throws IOException{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("utf.txt"),"gbk");
        char[] buf = new char[10];
        int len = isr.read(buf);
        String str = new String(buf,0,len);
        System.out.println(str);
        isr.close();
    }
    public static void writeText() throws IOException{
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk");
        osw.write("你好");
        osw.close();
    }
}
