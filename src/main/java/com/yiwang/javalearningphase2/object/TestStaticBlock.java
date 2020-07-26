package com.yiwang.javalearningphase2.object;

public class TestStaticBlock {
    static {
        System.out.println(" 此处，可执行类的初始化工作！");
    }
    public static void main(String[] args) {
        System.out.println("main 方法中的第一句");
    }
}
