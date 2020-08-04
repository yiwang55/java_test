package com.yiwang.javainterview.atguiguphase1.p2;

public class TestSingleton1 {
    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.INSTANCE;
        Singleton1 instance2 = Singleton1.INSTANCE;
        System.out.println(instance1.equals(instance2));
    }
}
