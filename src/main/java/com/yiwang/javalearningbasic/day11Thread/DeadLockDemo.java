package com.yiwang.javalearningbasic.day11Thread;
/*
* 死锁
* */
class Ticket3 implements Runnable{
    private static int tick = 1000;
        Object obj = new Object();
    boolean flag = true;

    @Override
    public void run() {
        if(flag)
        {
            while(true){
                synchronized (obj){
                        show();
                }
            }
        }
        else{
            while(true)
                show();
        }
    }
    public static synchronized void show(){
        if (tick > 0){
            try{Thread.sleep(10);}catch (Exception e){}
            System.out.println(Thread.currentThread().getName()+".....show : "+ tick--);
        }
    }
}
public class DeadLockDemo {
    public static void main(String[] args){
        Ticket2 t = new Ticket2();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        try{Thread.sleep(10);}catch (Exception e){
            t.flag = false;
            t2.start();
        }
    }

}
