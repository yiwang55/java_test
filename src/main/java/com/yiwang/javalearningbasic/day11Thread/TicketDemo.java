package com.yiwang.javalearningbasic.day11Thread;

class Ticket implements Runnable//extends Thread
{
    private static int tic = 100;
    public void run() {
        while (true) {
        if (tic >0){
            System.out.println(Thread.currentThread().getName() + "sale : " + tic--);
        }
        }
    }
}
public class TicketDemo {


    public static void main(String[] args){
        Ticket t = new Ticket();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);
//        Ticket t1 = new Ticket();
//        Ticket t2 = new Ticket();
//        Ticket t3 = new Ticket();
//        Ticket t4 = new Ticket();
//
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
