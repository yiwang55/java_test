package com.yiwang.javalearningbasic.IO;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException{
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("D:\\java资料\\video\\Java基础班视频精华版\\day14\\avi\\14.30_day14总结.avi")));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("bufferAvi.avi")));

        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = bufferedInputStream.read(bytes))!= -1){
            bufferedOutputStream.write(bytes, 0, len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
