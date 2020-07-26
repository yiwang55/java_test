package com.yiwang.javalearningbasic.day21IOStream;

public class EncodeDemo2 {
    public static  void main(String[] args) throws Exception{
        String s = "联通";
        byte[] b = s.getBytes("gbk");
        for(byte by: b){
            System.out.println(Integer.toBinaryString(by));
        }
    }
}
