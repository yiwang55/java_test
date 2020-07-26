package com.yiwang.javalearningbasic.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamDemo {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for (int x = 0; x < 10; x++){
            baos.write(("hello" + x).getBytes());
        }

        byte[] bytes = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        int by = 0;
        while((by = bais.read()) != -1){
             System.out.print((char) by);
         }
    }
}
