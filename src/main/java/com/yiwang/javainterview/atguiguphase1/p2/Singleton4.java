package com.yiwang.javainterview.atguiguphase1.p2;

public class Singleton4 {
    private static Singleton4 instance;
    private Singleton4(){

    }
    public static Singleton4 getInstance() throws InterruptedException {
        if (instance == null) {
            Thread.sleep(100);
            instance = new Singleton4();
        }
        return instance;
    }
}
