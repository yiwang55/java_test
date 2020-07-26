package com.yiwang.javalearningbasic.phase2;

import java.util.ArrayList;
import java.util.List;

public class ListContainAllTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list.containsAll(list1));
    }
}
