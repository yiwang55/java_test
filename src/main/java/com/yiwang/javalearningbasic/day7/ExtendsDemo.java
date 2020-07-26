package com.yiwang.javalearningbasic.day7;

/*
* 继承
* 1.提高了代码的复用性
* 2.类与类产生了关系，才有了多态的特性
* */

class Person{
    String name;
    int age;
}
class Student extends Person{

    void study(){
        System.out.println("good good study");
    }
}
class Worker extends Person{

    void work(){
        System.out.println("good good work");
    }
}
public class ExtendsDemo {

}
