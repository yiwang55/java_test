package com.yiwang.javalearningbasic.IO;

import java.io.*;

public class CopyFileDemo5 {
    public static void main(String[] args) throws IOException {
        BufferedReader  bufr = new BufferedReader(new FileReader("fw.txt"));
        BufferedWriter bufw = new BufferedWriter(new FileWriter("copyFileDemo5.txt"));
        String s = null;
        while ((s = bufr.readLine()) != null){
            bufw.write(s);
            bufw.newLine();
            bufw.flush();
        }
        bufr.close();
        bufw.close();
    }
}
