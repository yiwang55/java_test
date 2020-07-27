package com.yiwang.javainterview.atguiguphase1;

public class InterviewP1 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;    //i++ 是先把值压入操作数栈 再执行递增计算。这里 i = 1；
        int j = i++;    //i = 2 , j = 1；
        int k = i + ++i * i++; //2 + 3 * 3

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }
}
