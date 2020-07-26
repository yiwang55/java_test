package com.yiwang.javalearningbasic.java8.lambda;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MapTest {
    public static void main(String[] args) {
        List<String> collected = Stream.of("a", "b", "hello")
                .map(string -> string.toUpperCase()).collect(toList());
//        assertEquals(asList("A", "B", "HELLO"), collected);
    }
}
