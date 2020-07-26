package com.yiwang.javalearningbasic.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayList2FileDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("ArrayList2FileDemo.txt"));
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        for (String s : list){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
