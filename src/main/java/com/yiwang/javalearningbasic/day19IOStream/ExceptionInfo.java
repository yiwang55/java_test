package com.yiwang.javalearningbasic.day19IOStream;

import com.yiwang.javalearningbasic.SOP;

import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionInfo extends SOP {
    public static void main(String[] args){
        try{
            int[] arr = new int[2];
            sop(arr[3]);
        }catch(Exception e){
            try{
                PrintStream ps  = new PrintStream("exception.log");
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String s = sdf.format(d);
                ps.println(s);
                System.setOut(ps);
            }
            catch (IOException IOe){
                throw new RuntimeException("日志文件建立失败");
            }
            e.printStackTrace(System.out);
        }

    }

}
