package com.yiwang.javalearningphase2.exec;

class Account{
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 存钱成功，当前余额为： " + balance);
        }
    }
}

class Customer extends Thread{
    private Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }
}

public class DepositDemoTest {
    public static void main(String[] args) {
        Account account = new Account(0);
        Customer customer1 = new Customer(account);
        Customer customer2 = new Customer(account);
        customer1.setName("customer1");
        customer2.setName("customer2");

        customer1.start();
        customer2.start();
    }
}
