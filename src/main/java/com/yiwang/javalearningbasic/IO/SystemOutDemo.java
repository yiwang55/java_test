package com.yiwang.javalearningbasic.IO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SystemOutDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
        bufw.write("hello");
        bufw.newLine();
        bufw.write("hello2");
        bufw.newLine();
        bufw.write("hello3");

        bufw.close();
    }
}
