package com.yiwang.javalearningbasic.day9;

/*
* 异常就是程序在运行时出现的不正常情况。
* 异常的由来： 问题也是现实生活中的一个具体事物，
* 也可以通过java类进行描述，并封装成对象。
*
* */
class Demo {
    int div(int a,int b) throws Exception//在功能上通过throws关键字声明了该功能可能会出现问题
    {return  a/b;}
}
public class ExceptionDemo {
public static void main(String[] args){
    Demo d = new Demo();
    try{
        int x = d.div(4,0);
        System.out.println("x = "+ x);
    }
    catch (Exception e){//多态Exception e= new ExceptionType
        System.out.println("除零啦");
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        e.printStackTrace();
    }
    System.out.println("over");
//    byte[] arr = new byte[1024*1024*600];
}
}
