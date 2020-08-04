package com.yiwang.javainterview.atguiguphase1.p2;

import com.yiwang.javalearningphase2.thread.Singleton;

public class Singleton6 {
    private Singleton6(){

    }

    private static class Inner{
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance(){
        return Inner.INSTANCE;
    }
}
