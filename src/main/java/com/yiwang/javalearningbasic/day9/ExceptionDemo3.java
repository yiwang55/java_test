package com.yiwang.javalearningbasic.day9;

/*
* 异常就是程序在运行时出现的不正常情况。
* 异常的由来： 问题也是现实生活中的一个具体事物，
* 也可以通过java类进行描述，并封装成对象。
*
*
* throws和throw的区别
* throws使用在函数上：（）和{}之间
* throw使用在函数内
*
* throws后面跟的异常类，可以跟多个 用逗号隔开
* throw后面跟的是异常对象
* */
class FuShuException extends Exception{
    private int value;
    FuShuException(){
        super();
    }
    FuShuException(String msg,int value){
    super(msg);
    this.value=value;
}
public int getValue(){
        return value;
}

}
class Demo3 {
    int div(int a,int b) throws FuShuException
    {
        if (b<0)
            throw new FuShuException("by fushu",b);
        return  a/b;
    }
}
public class ExceptionDemo3 {
    public static void main(String[] args)//throws Exception
    {
        Demo3 d = new Demo3();
        try{
            int x = d.div(4, -1);
            System.out.println("x = " + x);
        }catch (FuShuException e){
            System.out.println(e.toString());
            System.out.println("除数出现负数了。负数是" + e.getValue());
        }

    }
}
