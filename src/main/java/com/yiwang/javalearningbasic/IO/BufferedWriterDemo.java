package com.yiwang.javalearningbasic.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bw.txt"));
        bufferedWriter.write("hello你好");
        bufferedWriter.newLine();
        bufferedWriter.write("hello你好");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
