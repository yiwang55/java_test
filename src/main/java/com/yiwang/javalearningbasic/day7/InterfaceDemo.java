package com.yiwang.javalearningbasic.day7;


/*
1.接口中常见定义：常量，抽象方法。
2.
3.
接口中的成员都是public的.
 */
interface Inter{
    public static  final int NUM =3;
    public abstract  void show();
}
interface InterA{
    void method();
}

class Demo1{
    public void function(){}
}

class Test extends Demo1 implements Inter,InterA{
    public void method() {

    }

    public void show() {
    }
}

interface A{
    void methodA();
}

interface B //extends A
{
    void methodB();
}

interface C extends B,A{
    void methodC();
}

class D implements C{
    @Override
    public void methodC() {
    }

    @Override
    public void methodA() {

    }
    public void methodB(){

    }
}


public interface InterfaceDemo {
    public static void main(String[] args){
//        System.out.println("");
        Test t = new Test();
        System.out.println(t.NUM);
        System.out.println(Test.NUM);
        System.out.println(Inter.NUM);
    }

}
