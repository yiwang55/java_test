package com.yiwang.javalearningbasic.day6;
///懒汉式
class Single1{
    private static Single1 s = null;
    private Single1(){}
    public static Single1 getInstance(){
        if (s ==null) {
            synchronized (Single1.class){
                if (s==null){
                    s = new Single1();
                }
            }
        }
            return s;
    }
}
/////定义单例模式，建议使用饿汉式。
public class SingleDemo2 {
}
