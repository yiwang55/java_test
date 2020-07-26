package com.yiwang.javalearningphase2.thread;

class RunnableTicketTest implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized(RunnableTicketTest.class){
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " sell window, ticket number" + ticket);
                ticket--;
            } else {
                break;
            }
        }
        }
    }
}

public class RunnableTicketDemo {
    public static void main(String[] args) {
        RunnableTicketTest win1 = new RunnableTicketTest();

        Thread thread = new Thread(win1);
        Thread thread1 = new Thread(win1);
        Thread thread2 = new Thread(win1);
        thread.start();
        thread1.start();
        thread2.start();
    }

}
