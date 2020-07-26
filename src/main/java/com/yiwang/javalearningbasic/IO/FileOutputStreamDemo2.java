package com.yiwang.javalearningbasic.IO;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fs = new FileOutputStream("fos2.txt", true);
        for (int a =0; a<10;a++){
            fs.write(("hello "+ a + "\n").getBytes());
        }
        fs.close();
    }
}
