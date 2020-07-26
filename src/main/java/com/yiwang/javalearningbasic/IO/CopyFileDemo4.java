package com.yiwang.javalearningbasic.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo4 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("a.txt");
        FileWriter fileWriter = new FileWriter("fw.txt");

        int len =0;
        char[] chars = new  char[1024];
        while((len = fileReader.read(chars)) != -1){
            fileWriter.write(chars, 0 , len);
            fileWriter.flush();
        }

        fileReader.close();
        fileWriter.close();
    }
}
