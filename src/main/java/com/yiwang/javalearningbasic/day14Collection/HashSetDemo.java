package com.yiwang.javalearningbasic.day14Collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by yiwang on 2018/6/7.
 */

/**
 * Set:元素是无序的（存入和取出的顺序不一定一致），元素不可以重复
 * --HashSet：底层数据结构式hash表
 * --
 * Set集合的功能和Collection是一致的
 *
 * **/

public class HashSetDemo {
    public static void sop(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args0){

        HashSet hs = new HashSet();

        sop(hs.add("java01"));
        sop(hs.add("java01"));
        hs.add("java02");
        hs.add("java03");
        hs.add("java03");
        hs.add("java04");

        Iterator it = hs.iterator();
        while(it.hasNext())
        {
            sop(it.next());
        }
    }
}
