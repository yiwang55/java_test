package com.yiwang.javalearningbasic.day13String;

/**
 * Created by yiwang on 2018/6/4.
 */
/*
基本数据类型对象包类
* byte Byte
* long Long
* short Short
* float Float
* boolean Boolean
* double Double
* char Character
* int Integer
* */

public class IntegerDemo {
public  static void sop (Object obj){
    System.out.println(obj);
}
    public static void main(String[] args){
//    sop("int max = " + Integer.MAX_VALUE);
//        sop(Integer.toString(34));
//        sop(Integer.parseInt("34") + 4);
        sop(Integer.toBinaryString(6));
        sop(Integer.toHexString(60));

        int x  = Integer.parseInt("110",2);
        sop("x= "+ x);
        int x1  = Integer.parseInt("3c",16);
        sop("x1= "+ x1);
    }
}
