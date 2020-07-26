package com.yiwang.javalearningphase2.thread;

public class ThreadTest {
    public static void main(String[] args) {

        new Thread(() -> {
            Thread.currentThread().setName("线程1");
            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getPriority() + ":" + i);
                }
            }
        }).start();

        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getPriority() + ":" + i);
            }
        }
    }
}
