package com.yiwang.javalearningbasic.IO;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("pw.txt");

        pw.write("hello");
        pw.write("world");
        pw.write("java");

        pw.close();
    }
}

