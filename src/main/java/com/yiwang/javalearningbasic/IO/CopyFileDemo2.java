package com.yiwang.javalearningbasic.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("D:\\java资料\\video\\Java基础班视频精华版\\day14\\avi\\14.30_day14总结.avi"));
        FileOutputStream fos = new FileOutputStream(new File("avi.avi"));
        int len = 0;
//        byte[] by = new byte[10];/**/
        byte[] by = new byte[1024];
        while((len = fis.read(by)) != -1){
            fos.write(by, 0 , len);
        }
        fis.close();
        fos.close();
    }
}
