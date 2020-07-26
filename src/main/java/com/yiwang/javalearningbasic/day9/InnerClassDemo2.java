package com.yiwang.javalearningbasic.day9;

/*
* 内部类的访问规则：
* 1.内部类可以直接访问外部类中的成员，包括私有
*    之所以可以直接访问外部类中的成员，是因为内部类中持有了一个外部类的引用，格式 外部类名.this
* 2.外部类要访问内部类，必须要建立内部类对象
*
* 访问格式
*   1. 当内部类东已在外部类成员位置上，而且非私有，可以在外部其他类中，可以直接建立内部类对象
*   格式
*   Outer.Inner in = new Outer().new Inner();
*   2.当内部类在成员位置上，可以被成员修饰符修饰。
*   比如private： 将内部类在外部类中进行封装。
*   Static :内部类具有static的特性.
*   当内部类被static修饰后，只能直接访问外部类中的静态成员。出现了访问局限。
*
* *   在外部其它类中，如何直接访问static内部类的非静态成员呢？
*        new Outer1.Inner().function();
*   在外部其它类中，如何直接访问static内部类的静态成员呢？
        Outer1.Inner.function();

      注意： 当内部类中定义了静态成员，该内部类必须是静态的。
            当外部类中的静态方法访问内部类时，内部类也必须时静态的

* */
class Outer1 {

    private static int x = 3;

    //private //
    //static
    static class Inner {
        //        int x=4;
        static void function() {
//            int x =6;
            System.out.println("inner : " + x);
        }
    }
    static class Inner2{
        void show(){
            System.out.println("Inner2 show");
        }
    }
    public static void method(){
//        Inner.function();
        new Inner2().show();
    }
}
public class InnerClassDemo2 {
    public static void main(String[] args){
        Outer1.method();
        //        Outer1.Inner.function();
        // new Outer1.Inner().function();

//        Outer out = new Outer();
//        out.method();
        //直接访问内部类中的成员
//        Outer.Inner in = new Outer().new Inner();
//        in.function();
    }
}
