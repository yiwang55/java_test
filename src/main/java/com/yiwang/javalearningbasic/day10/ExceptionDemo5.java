package com.yiwang.javalearningbasic.day10;

class Demo{
    public void method(){
        try{
            throw new Exception();
        }
        catch (Exception e){
        }
        finally{
            //关闭资源
        }
    }
}
public class ExceptionDemo5 {
    public static void main(String[] args){
        System.out.println("hello world!");
    }
}
