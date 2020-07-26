package com.yiwang.javalearningbasic.day18System;

import com.yiwang.javalearningbasic.SOP;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by yiwang on 2018/6/23.
 */
public class FileWriterDemo2 extends SOP {
    public static void main(String[] args){
        FileWriter fw = null;
        try{
            fw = new FileWriter("C:\\java资料\\test1\\test.txt");
            fw.write("abc");
        }catch (IOException e){
            sop(e.toString());
        }
        finally {
            try{
                if (fw != null)
                fw.close();
            }
            catch (IOException e){
                sop(e.toString());
            }
        }
    }
}
