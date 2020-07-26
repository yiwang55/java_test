package com.yiwang.javalearningbasic.day19IOStream;

import com.yiwang.javalearningbasic.SOP;

/**装饰设计模式
 * 当想要对已有对象进行功能增强时，
 * 可以定义类，将已有对象传入，基于已有的功能，并提供加强功能。
 * 自定义的类称为装饰类
 *
 * **/
class Person extends SOP {
    public void eat(){
        sop("chifan");
    }
}

class SuperPerson{
    private Person p;
    SuperPerson(Person p){
        this.p = p;
    }
    public void superEat(){
        System.out.println("开胃酒");
        p.eat();
        System.out.println("甜点");
    }
}

public class PersonDemo {
    public static void main(String[] args){
        Person p  = new Person();
        SuperPerson sp = new SuperPerson(p);
        sp.superEat();
    }
}
