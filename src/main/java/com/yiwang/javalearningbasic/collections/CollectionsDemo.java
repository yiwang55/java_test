package com.yiwang.javalearningbasic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);        list.add(50);        list.add(59);list.add(80);        list.add(18);list.add(10);        list.add(1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.max(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
