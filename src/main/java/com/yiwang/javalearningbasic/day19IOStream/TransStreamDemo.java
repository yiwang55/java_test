package com.yiwang.javalearningbasic.day19IOStream;

import java.io.*;

/**
 * Created by yiwang on 2018/6/27.
 */
public class TransStreamDemo {
    public static void main(String[] args) throws IOException{
//        InputStream in = System.in;
//        InputStreamReader isr = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(isr);
//
//        OutputStream out = System.out;
//        OutputStreamWriter osw = new OutputStreamWriter(out);
//        BufferedWriter bw = new BufferedWriter(osw);

        //键盘录入最常见写法
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = null;
        while((s = bufr.readLine()) != null){
            if("over".equals(s))
                break;
//            System.out.println(s);
            bufw.write(s.toUpperCase());
            bufw.newLine();
            bufw.flush();
        }
        bufr.close();
        bufw.close();
    }
}
