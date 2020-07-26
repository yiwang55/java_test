package com.yiwang.javalearningphase2.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Window implements Runnable{
    private int ticket = 100;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            try {
                lock.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
public class LockTest {
    public static void main(String[] args) {
        Window window = new Window();
        Thread win1 = new Thread(window,"win1");
        Thread win2 = new Thread(window,"win3");
        Thread win3 = new Thread(window,"win2");

        win1.start();
        win2.start();
        win3.start();
    }



}
