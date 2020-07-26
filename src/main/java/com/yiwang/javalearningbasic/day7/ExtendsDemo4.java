package com.yiwang.javalearningbasic.day7;

class Fu1{
    Fu1(){
       System.out.println("fu run");
    }
    Fu1(int x){
        System.out.println("fu run");
    }
}
class Zi1 extends Fu1{
    Zi1(){
//        super();
        super(4);
        System.out.println("zi run");
    }
    Zi1(int x){
//        super();
        super(2);
        System.out.println("zi run" + x);
    }
}
public class ExtendsDemo4 {
    public  static void main(String[] args){
        Zi1 a = new Zi1();
        Zi1 z = new Zi1(4);
    }
}
