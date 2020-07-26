package com.yiwang.javalearningbasic.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"), "UTF-8");
        osw.write("你好啊小伙伴");
        osw.flush();
        osw.close();
    }
}
