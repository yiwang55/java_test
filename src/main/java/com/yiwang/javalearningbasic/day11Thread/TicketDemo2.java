package com.yiwang.javalearningbasic.day11Thread;


class Ticket1 implements Runnable//extends Thread
{
    private static int tic = 100;
    Object obj = new Object();
    public void run()    {
        while (true) {
            synchronized (obj){
            if (tic >0){
                try {
                    Thread.sleep(100);
                }
                catch(Exception e){                }
                System.out.println(Thread.currentThread().getName() + "sale : " + tic--);
            }
            }
        }
    }
}
public class TicketDemo2 {
    public static void main(String[] args){
        Ticket1 t = new Ticket1();

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
