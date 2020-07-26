package com.yiwang.javalearningbasic.day9;

/*
* 异常就是程序在运行时出现的不正常情况。
* 异常的由来： 问题也是现实生活中的一个具体事物，
* 也可以通过java类进行描述，并封装成对象。
*
* */
class Demo2 {
    int div(int a,int b)
            throws ArithmeticException,ArrayIndexOutOfBoundsException//在功能上通过throws关键字声明了该功能可能会出现问题
    {
        int[] arr = new int[a];
        System.out.println(arr[4]);
        return  a/b;
    }
}
public class ExceptionDemo2 {
    public static void main(String[] args)//throws Exception
    {
        try {
            Demo2 d = new Demo2();
            int x = d.div(4,1);
//            int x = d.div(5,0);
            System.out.println("x = "+ x);
        }catch (Exception e){
            System.out.println(e.toString());
        }
        /*
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        */
        System.out.println("over");
//    byte[] arr = new byte[1024*1024*600];
    }
}
