package com.yiwang.javalearningbasic.day16Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * map集合的两种取出方式
 * 1，keySet：将map中所有的Key取出存入到set中，set具备it迭代器，迭代出所有的key，再根据get方法 获取对应的value
 *
 * 2,entrySet:
 * **/
public class MapDemo2 {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String,String>();

        map.put("01","zhangsan1");
        map.put("02","zhangsan2");
        map.put("03","zhangsan3");
        map.put("04","zhangsan4");

        Set<Map.Entry<String,String>> entrySet = map.entrySet();

        Iterator<Map.Entry<String,String>> it = entrySet.iterator();

        while (it.hasNext()){
            Map.Entry<String,String> me = it.next();
            String key = me.getKey();
            String value = me.getValue();
            System.out.println("Key = "+ key + "    value = " + value);
        }
//        Set<String> keySet = map.keySet();
//
//        Iterator<String> it = keySet.iterator();
//        while(it.hasNext()){
//            String key = it.next();
//            System.out.println("Key = "+ key + "    value = "+map.get(key));
//        }
    }
}
