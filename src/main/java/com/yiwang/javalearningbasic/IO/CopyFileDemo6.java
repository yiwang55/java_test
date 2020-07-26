package com.yiwang.javalearningbasic.IO;

import java.io.*;

public class CopyFileDemo6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\MyProject\\JavaPhase2\\src\\com\\java\\IO\\DiGuiDemo.java"));
        PrintWriter pw = new PrintWriter(new FileWriter("Copy.java"));

        String line = null;
        while((line = br.readLine()) != null){
            pw.println(line);
        }
        br.close();
        pw.close();

    }
}
