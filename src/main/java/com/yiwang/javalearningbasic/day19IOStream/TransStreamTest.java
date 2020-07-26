package com.yiwang.javalearningbasic.day19IOStream;

import java.io.*;

public class TransStreamTest {
    public static void main(String[] args) throws IOException{

        BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("BufferedWriterDemo_Copy.txt")));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = null;
        while((line =bufr.readLine()) != null){
            if("over".equals(line))
                break;
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }
        bufr.close();
        bufw.close();
    }
}
