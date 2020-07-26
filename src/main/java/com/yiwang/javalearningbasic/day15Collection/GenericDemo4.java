package com.yiwang.javalearningbasic.day15Collection;

/**
 * Created by yiwang on 2018/6/13.
 */

//class Demo<T>{
//    public void show(T t){
//        System.out.println("Show: "+ t);
//    }
//    public void print(T t){
//        System.out.println("print: "+ t);
//    }
//}

//class Demo{
//    public <T> void show(T t){
//        System.out.println("Show: "+ t);
//    }
//    public <T> void print(T t){
//        System.out.println("print: "+ t);
//    }
//}

class Demo<T>{
    public void show(T t){
        System.out.println("Show: "+ t);
    }
    public <T> void print(T t){
        System.out.println("print: "+ t);
    }
//    public static void method(T t){
//        System.out.println("method: "+ t);
//    }静态方法不能访问类上定义的泛型
}

public class GenericDemo4 {
    public static void main(String[] args){
        Demo<String> d = new Demo<String>();
        d.show("hahha");
        d.print(4);
        d.print("hehe");
    }
}
