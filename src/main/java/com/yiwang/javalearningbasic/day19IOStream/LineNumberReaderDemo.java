package com.yiwang.javalearningbasic.day19IOStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("BufferedWriterDemo_Copy.txt");
        LineNumberReader lr = new LineNumberReader(fr);
        String line = null;
        lr.setLineNumber(100);
        while((line = lr.readLine())!= null){
            System.out.println(lr.getLineNumber()+": "+line);
        }
        lr.close();
    }
}
