package com.yiwang.javalearningphase2.thread;

public class ThreadExceptionTest {
    public static void main(String[] args) {
        try{
            new Thread(() -> {
                try{int a = 10/0;}catch (
                        Exception e
                ) {
                    throw new RuntimeException();
                }
            }).start();
        }catch (Exception e){
            System.out.println("divide 0" + e.getMessage());
        }
    }
}
