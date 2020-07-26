package com.yiwang.javalearningbasic.day9;

/*
* 异常就是程序在运行时出现的不正常情况。
* 异常的由来： 问题也是现实生活中的一个具体事物，
* 也可以通过java类进行描述，并封装成对象。
*
* */
class Demo4 {
    int div(int a,int b)//throws ArithmeticException
    {
    if(b == 0 )
        throw new ArithmeticException(" % by 0");
        return  a/b;
    }
}
public class ExceptionDemo4 {
    public static void main(String[] args){
        Demo4 d = new Demo4();
            int x = d.div(4,0);
            System.out.println("x = "+ x);
            System.out.println("over");
//    byte[] arr = new byte[1024*1024*600];
    }
}
