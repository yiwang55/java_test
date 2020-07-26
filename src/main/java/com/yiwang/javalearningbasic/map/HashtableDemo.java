package com.yiwang.javalearningbasic.map;

import java.util.Hashtable;

/**
 * Hashtable 和 HashMap的区别
 * Hashtable 底层为哈希表结构， KV不允许为null值，线程同步，安全 效率低；
 * HashMap 底层为哈希表结构， KV允许为null值，线程不同步，不安全 效率高；
 */
public class HashtableDemo {
    public static void main(String[] args) {
//        HashMap<String, String> hm = new HashMap<>();

        Hashtable<String, String> hm = new Hashtable<>();
        hm.put("001","hello");
//        hm.put(null,"world");
//        hm.put("java",null);

        for (String s : hm.keySet()){
            System.out.println(s + "----"+ hm.get(s));
        }

    }
}
