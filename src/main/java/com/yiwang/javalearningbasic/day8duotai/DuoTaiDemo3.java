package com.yiwang.javalearningbasic.day8duotai;

class Fu{

    static int num = 5;
    void method1(){
        System.out.println("fu method_1");
    }
    void method2(){
        System.out.println("fu method_2");
    }
    static void method4(){
        System.out.println("fu method_4");
    }
}
class Zi extends Fu{
    static int num = 8;
    void method1(){
        System.out.println("zi method_1");
    }
    void method3(){
        System.out.println("zi method_3");
    }
//    void method4(){
//        System.out.println("zi method_4");
//    }
}
public class DuoTaiDemo3 {
    public static void main(String[] args){
        Fu f= new Zi();
        System.out.println(f.num);
//        f.method4();
        Zi z = new Zi();
        System.out.println(z.num);
//        z.method4();
        //        Fu f= new Zi();//编左运右（编父运子）
//        f.method1();
//        f.method2();
        //        Zi z = new Zi();
//        z.method1();
//        z.method2();
//        z.method3();
//        Fu f= new Zi();
//        System.out.println("fu.num=" +f.num);
//        Zi z = new Zi();//成员变量在多态情况下
//        //无论编译和运行都参考左边
//        System.out.println("zi.num=" +z.num);
    }
}
