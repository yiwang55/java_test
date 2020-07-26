package com.yiwang.javalearningbasic.day18System;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by yiwang on 2018/6/23.
 */
public class FileWriterDemo3 {
    public static void main(String[] args){
        FileWriter fw = null;
        try{
            fw = new FileWriter("C:\\java资料\\test\\test.txt",true);
//            fw.write("haha");
            fw.write("nihao\nzaijia");
        }catch (IOException e){
///TBD
        }finally{
            try{fw.close();}catch (IOException e){
                //TBD
            }
        }

    }
}
