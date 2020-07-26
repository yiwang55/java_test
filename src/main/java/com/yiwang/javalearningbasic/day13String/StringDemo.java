package com.yiwang.javalearningbasic.day13String;

/**
 * Created by yiwang on 2018/6/3.
 */
public class StringDemo {
    public static void main(String[] args){
        String s1 = "abc";//s1是一个String类型变量，abc是一个对象
                            //字符串最大特点，一旦初始化就不可以改变。
//        s1 = "kk";
        String s2 = new String("abc");
        //s1 和s2有什么区别？
        //s1在内存中有一个对象
        //s2在内存中有两个对象


        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));//String类复写了object类中的equals方法，
                                            //该方法用于判断字符串是否相同。
    }
}
