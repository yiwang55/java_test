package com.yiwang.javalearningbasic.day18System;


public class RunTimeDemo {
    public static void main(String[] args) throws Exception{
        Runtime r = Runtime.getRuntime();
            Process p = r.exec("notepad.exe SystemDemo.java");

            Thread.sleep(4000);
            p.destroy();

    }
}
