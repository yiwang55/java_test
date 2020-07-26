package com.yiwang.javalearningbasic.IO;

import java.io.*;

public class CopyFileDemo3 {
    public static void main(String[] args)  throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));

        int len = 0;
        char[] chars = new char[1024];
        while ((len = isr.read(chars)) != -1){
            osw.write(chars, 0 , len);
            osw.flush();
        }
        isr.close();
        osw.close();
    }
}
