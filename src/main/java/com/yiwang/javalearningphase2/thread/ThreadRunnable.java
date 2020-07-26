package com.yiwang.javalearningphase2.thread;

public class ThreadRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadRunnableClass());
        thread.start();
    }
}

///**/
class ThreadRunnableClass implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getPriority() + ":" + i);
            }
        }
    }
}
