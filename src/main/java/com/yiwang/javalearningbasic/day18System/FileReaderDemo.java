package com.yiwang.javalearningbasic.day18System;

import com.yiwang.javalearningbasic.SOP;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by yiwang on 2018/6/23.
 */
public class FileReaderDemo extends SOP {
    public static void main(String[] args){
        FileReader fr = null;
        try{
            fr = new FileReader("demo.txt");

            while(true){
                int ch = fr.read();
                if(ch == -1)
                    break;
                sop((char)ch);
            }

        }catch (IOException e){
        }finally{
            try{
                if (fr != null)
                fr.close();
            }catch (IOException e){}
        }

    }
}
