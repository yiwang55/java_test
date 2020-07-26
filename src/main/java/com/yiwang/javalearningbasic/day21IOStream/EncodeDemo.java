package com.yiwang.javalearningbasic.day21IOStream;

import java.util.Arrays;

public class EncodeDemo {
    public static void main(String[] args) throws Exception{
        String s = "你好";
//        byte[] b1 = s.getBytes("utf-8");
        byte[] b1 = s.getBytes("gbk");
        System.out.println(Arrays.toString(b1));
        String s1 = new String(b1,"iso8859-1");
        System.out.println("s1=" + s1);

        byte[] b2 = s1.getBytes("iso8859-1");
        System.out.println(Arrays.toString(b2));
        String s2 = new String(b2,"gbk");
        System.out.println("s2 = "+s2);
    }
}
