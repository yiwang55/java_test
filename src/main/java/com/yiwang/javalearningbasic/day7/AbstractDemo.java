package com.yiwang.javalearningbasic.day7;


/*
* 抽象：看不懂
* 1.抽象方法一定在抽象类中
* 2.抽象方法和抽象类一定要用abstract关键字修饰
* 3.抽象类不可以用new 创建对象
* 4.抽象类的抽象方法要被调用，必须由子类复写所有的抽象方法后，建立子类对象调用
* 如果子类只覆盖了部分抽象方法，那么该子类还是个抽象类
* */
abstract class Student1{
    abstract void study();
//    abstract void study1();
    void sleep(){

        System.out.println("tangzhes sleep");
    }
}

class ChongCiStudent extends Student1{
    void study(){
        System.out.println("chongci study");
    }
}

class BaseStudent extends Student1{
    void study(){
        System.out.println("base study");
    }
}

class AdvanceStudent{
    void study(){
        System.out.println("adv study");
    }
}

public class AbstractDemo {
    public static void main(String[] args){

    }
}
