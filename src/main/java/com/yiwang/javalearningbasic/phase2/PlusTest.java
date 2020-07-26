package com.yiwang.javalearningbasic.phase2;

public class PlusTest {
    public static void main(String[] args) {
        String[] split = "4e1267a9-912d-;443d-89a2-7576f93b5b70;e5cdc31e-4962-4072;-9cf3-8894c8c08438".split(";");
        for (String str: split
             ) {
            System.out.println(str);
        }
    }
}
