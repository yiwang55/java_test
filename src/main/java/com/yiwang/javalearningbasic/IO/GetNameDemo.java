package com.yiwang.javalearningbasic.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class GetNameDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufr = new BufferedReader(new FileReader("getName.txt"));
        String s = null;
        while((s = bufr.readLine()) != null){
            list.add(s);
        }

        Random r = new Random();
        int i = r.nextInt(list.size());
        System.out.println(list.get(i));
    }
}
