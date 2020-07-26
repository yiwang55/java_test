package com.yiwang.javalearningbasic.IO;

import java.io.UnsupportedEncodingException;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "你好啊";
        byte[] bytes = s.getBytes("UTF-8");
        System.out.println(new String(bytes));
    }
}
