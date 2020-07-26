package com.yiwang.javalearningbasic.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo2 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"),true);
        pw.print(true);
        pw.print(1000);
        pw.print("hello");

        pw.close();
    }
}
