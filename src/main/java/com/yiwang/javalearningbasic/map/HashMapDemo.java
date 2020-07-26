package com.yiwang.javalearningbasic.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "wy");
        hashMap.put("2", "cyz");
        hashMap.put("3", "yy");

        Set<String> set = hashMap.keySet();
        for (String s: set){
            System.out.println(s +"-----"+ hashMap.get(s));
        }
        //entrySet
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+ "----" + next.getValue());
        }

        for (Map.Entry<String, String> me: entrySet
             ) {
            System.out.println(me.getKey()+"----"+me.getValue());
        }
    }
}
