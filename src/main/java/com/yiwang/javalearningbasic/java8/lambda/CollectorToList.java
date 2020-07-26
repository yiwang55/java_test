package com.yiwang.javalearningbasic.java8.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorToList {
    public static void main(String[] args) {
        List<String> collect = Stream.of("a", "abc", "aa", "cda").collect(Collectors.toList());
        for (String s: collect
             ) {
            System.out.println(s);
        }
    }
}
