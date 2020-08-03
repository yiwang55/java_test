package com.yiwang.javainterview.atguiguphase1.c2;

public class SingletonP2 {
    private static final SingletonP2 single = new SingletonP2();

    private SingletonP2() {
    }

    public SingletonP2 getInstance() {
        return single;
    }
}
