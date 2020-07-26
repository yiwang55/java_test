package com.yiwang.javalearningbasic.day7;
/*
*  final
*  1.可以修饰类，韩式，变量
*  2.被final修饰的类不能被继承。
*  3.被final修饰的方法不能被复写
*  4.被final修饰的变量是一个常量只能赋值一次。
*  常量书写规范是所有字母都是大写
*  5.
* */
 class Demo{

     final int x=3;
    public static final double PI = 3.14;
    final void show1(){
    }
    void show2(){
        final int y=4;
    }
}
class SubDemo extends Demo{
     void show2(){}
}

public class FinalDemo {
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
