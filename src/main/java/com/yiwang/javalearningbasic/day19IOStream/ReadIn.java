package com.yiwang.javalearningbasic.day19IOStream;

/**
 * Created by yiwang on 2018/6/27.
 */

import java.io.IOException;
import java.io.InputStream;

/**
 * 读取键盘录入
 * **/
public class ReadIn {
    public static void main(String[] args) throws IOException{
        InputStream in = System.in;
        StringBuffer sb = new StringBuffer();

        while(true){
            int ch = in.read();
            if (ch == '\r')
                continue;
            if (ch == '\n'){
                String s = sb.toString();
                if ("over".equals(s))
                    break;
                System.out.println(s.toUpperCase());
                sb.delete(0,sb.length());
            }else
                sb.append((char) ch);
        }
    }
}
