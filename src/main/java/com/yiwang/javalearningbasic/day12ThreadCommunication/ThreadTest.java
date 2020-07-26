package com.yiwang.javalearningbasic.day12ThreadCommunication;

/**
 * Created by yiwang on 2018/6/3.
 */

public class ThreadTest {
    public static void main(String[] args){
//        System.out.println("hello world");

        new Thread(){
            public void run(){
                for(int x = 0;x < 200; x++)
                {
                    System.out.println(Thread.currentThread().getName()+"..."+x);
                }
            }
        }.start();


        for(int x = 0;x < 200; x++)
        {
            System.out.println(Thread.currentThread().getName()+"..."+x);
        }

        Runnable r = new Runnable(){
            public void run(){
                for(int x = 0;x < 200; x++)
                {
                    System.out.println(Thread.currentThread().getName()+"..."+x);
                }
            }
        };

        new Thread(r).start();


    }
}
