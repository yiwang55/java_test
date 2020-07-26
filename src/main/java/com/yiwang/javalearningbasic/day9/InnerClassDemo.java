package com.yiwang.javalearningbasic.day9;

/*
* 内部类的访问规则：
* 1.内部类可以直接访问外部类中的成员，包括私有
*    之所以可以直接访问外部类中的成员，是因为内部类中持有了一个外部类的引用，格式 外部类名.this
* 2.外部类要访问内部类，必须要建立内部类对象
* */
class Outer{

    private int x = 3;
    //private //
    class Inner{
        int x=4;
        void function(){
            int x =6;
            System.out.println("inner : " + Outer.this.x);
        }
    }

    void method(){
        Inner i = new Inner();
        i.function();
//        System.out.println(x);
    }
}
public class InnerClassDemo {
    public static void main(String[] args){
//        Outer out = new Outer();
//        out.method();
        //直接访问内部类中的成员
        Outer.Inner in = new Outer().new Inner();
        in.function();
    }
}
