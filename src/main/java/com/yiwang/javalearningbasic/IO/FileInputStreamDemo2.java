package com.yiwang.javalearningbasic.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        byte[] by = new byte[5];
        int len = 0;
        while((len = fis.read(by)) != -1){
            System.out.println(new String(by, 0 ,len));
        }
        fis.close();
    }
}
