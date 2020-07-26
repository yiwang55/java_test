package com.yiwang.javalearningbasic.day14Collection;

import java.util.LinkedList;
/**
 * LinkList特有方法
 * getFirst()
 * getLast()
 *
 * removeFirst()
 * removeLast()
 *
 * jdk1.6后新方法
 * offerFirst()
 * offerLast()
 *
 * peekFirst()
 * peekLast()
 *
 * pollFirst()
 * pollLast()
 */
public class LinkedListDemo {

    public static void sop(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args){
        LinkedList link = new LinkedList();

        link.addLast("java01");
        link.addLast("java02");
        link.addLast("java03");
        link.addLast("java04");

//        sop(link.getFirst());
//        sop(link.getLast());
//        sop(link.removeFirst());
//        sop("size = " + link.size());
//        sop(link);

//        while(!link.isEmpty()){
//            sop(link.removeFirst());
//        }

//        sop(link.offerFirst("java001"));
//        sop(link.peekFirst());
        sop(link.pollFirst());
        sop(link);


    }
}
