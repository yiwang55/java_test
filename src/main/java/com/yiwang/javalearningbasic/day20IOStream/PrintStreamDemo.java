package com.yiwang.javalearningbasic.day20IOStream;

import com.yiwang.javalearningbasic.SOP;

import java.io.*;

public class PrintStreamDemo extends SOP {
    public static void main(String[] args) throws IOException{
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter out = new PrintWriter(new FileWriter("a.txt"),true);

        String line = null;
        while((line = bufr.readLine())!=null){
            if("over".equals(line))
                break;
            out.println(line.toUpperCase());
        }
        bufr.close();
        out.close();

    }
}
