package com.yiwang.javalearningbasic.day11Thread;

class Test extends Thread{
//    private String name;
     Test(String name){
//         this.name = name;
         super(name);
     }
    public void run(){
        for (int a=0; a< 100; a++)
        System.out.println(Thread.currentThread().getName() + " test run " + a);

    }
}

public class ThreadTest {
    public static  void main(String[] args){
        Test t1 = new Test("one---");
        Test t2= new Test("two+++");
        t1.start();
        t2.start();
        for (int i=0; i<100; i++)
            System.out.println("Hello World!" + i);
    }
}
