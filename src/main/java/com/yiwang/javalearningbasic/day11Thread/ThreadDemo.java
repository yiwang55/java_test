package com.yiwang.javalearningbasic.day11Thread;


/*
* 主函数的执行 其实也是多线程  jvm启动不止一个线程，还有一个垃圾回收线程只是看不到而已。
* */

class Demo extends Thread {
    @Override
    public void run() {
        for (int i=0; i<100; i++)
        System.out.println("demo run" + i);
    }
}

public class ThreadDemo {
    public static void main(String[] args){
//        for (int i=0; i<400; i++){
//            System.out.println("Hello World!");
//        }
        Demo d = new Demo();
        d.start();//开启线程并执行该线程的run方法
        d.run();//仅仅是对象调用方法，而线程创建了但是没有启动。

        for (int i=0; i<100; i++)
            System.out.println("Hello World!" + i);
    }
}
