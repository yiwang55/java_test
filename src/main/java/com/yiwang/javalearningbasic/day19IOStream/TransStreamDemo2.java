package com.yiwang.javalearningbasic.day19IOStream;

import java.io.*;

public class TransStreamDemo2 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("transDemo.txt"),"GBK"));

        String line = null;
        while((line = bufr.readLine()) != null){
            if("over".equals(line))
                break;
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }
        bufr.close();
        bufw.close();
    }
}
