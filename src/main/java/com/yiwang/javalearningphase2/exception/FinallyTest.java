package com.yiwang.javalearningphase2.exception;

import java.util.ArrayList;
import java.util.List;

public class FinallyTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int f = f(2);
        System.out.println(f);
    }

    public static int f(int value) {
        try {
            return value * value;
        } finally {
            if (value == 2) {
                return 0;
            }
        }
    }
}
