package com.yiwang.javalearningbasic.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class File2ArrayListDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufr = new BufferedReader(new FileReader("ArrayList2FileDemo.txt"));
        String s = null;
        while((s = bufr.readLine()) != null){
            list.add(s);
        }
        bufr.close();

        for (String str : list){
            System.out.println(str);
        }
    }
}
