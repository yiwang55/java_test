package com.yiwang.javalearningbasic.day19IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPic {
    public static void main(String[] args){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream("mypic.png");
            fos = new FileOutputStream("mypic1.png");
            byte[] pic = new byte[1024];
            int len = 0;
            while((len = fis.read(pic)) != -1){
                fos.write(pic,0,len);
            }
        }
            catch (IOException e){
                throw new RuntimeException("读写失败");
        }finally {
                try{
                    if(fos != null)
                        fos.close();
                    if(fis != null)
                        fis.close();
                }catch (IOException e){
                    throw new RuntimeException("读写关闭失败");
                }
        }

    }
}
