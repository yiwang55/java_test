package com.yiwang.javalearningbasic.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\var\\demo\\a.txt");
        int read = 0;
        while((read = fis.read()) != -1){
            System.out.print((char) read);
        }

        fis.close();
    }
}
