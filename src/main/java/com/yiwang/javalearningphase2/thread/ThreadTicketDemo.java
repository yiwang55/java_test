package com.yiwang.javalearningphase2.thread;

class TicketTest extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(this.getName() + " sell window, ticket number" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}

public class ThreadTicketDemo {
    public static void main(String[] args) {
        TicketTest win1 = new TicketTest();
        win1.setName("win1");
        TicketTest win2 = new TicketTest();
        win2.setName("win2");
        TicketTest win3 = new TicketTest();
        win3.setName("win3");

        win1.start();
        win2.start();
        win3.start();
    }
}
