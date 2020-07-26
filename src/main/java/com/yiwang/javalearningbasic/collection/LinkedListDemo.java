package com.yiwang.javalearningbasic.collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        System.out.println(linkedList);

        linkedList.addFirst("javaEE");
        System.out.println(linkedList);
    }
}
