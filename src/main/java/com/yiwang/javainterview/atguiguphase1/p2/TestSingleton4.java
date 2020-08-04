package com.yiwang.javainterview.atguiguphase1.p2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestSingleton4 {
    public static void main(String[] args) throws Exception {
//        Singleton4 instance = Singleton4.getInstance();
//        Singleton4 instance1 = Singleton4.getInstance();
//        System.out.println(instance.equals(instance1));
        Callable<Singleton4> c = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton4> f1 = es.submit(c);
        Future<Singleton4> f2 = es.submit(c);
        Singleton4 s1 = f1.get();
        Singleton4 s2 = f2.get();
        System.out.println(s1.equals(s2));
        es.shutdown();
    }
}
