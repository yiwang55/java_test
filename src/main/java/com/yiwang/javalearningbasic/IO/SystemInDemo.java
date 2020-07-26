package com.yiwang.javalearningbasic.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while((line = bufr.readLine()) != null){
                if ("over".equals(line)){
                    break;
                }else {
                    System.out.println(line);
                }
        }
        bufr.close();
    }
}
