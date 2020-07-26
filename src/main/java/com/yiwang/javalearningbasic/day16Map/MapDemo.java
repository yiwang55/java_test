package com.yiwang.javalearningbasic.day16Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Map集合
 * 集合存储键值对，保证键的唯一性
 * 1.添加
 *      put()
 *      putAll()
 * 2.删除
 *      remove()
 *      clear()
 * 3.判断
 *      containsKey()
 *      containsValue()
 *      isEmpty()
 * 4.获取
 *      get()
 *      size()
 *      values()
 *
 *      entrySet()
 *      keySet()
 *
 * Map
 * ---HashTable
 * 底层是哈希表数据结构，不可以存入NULL作为Key或者Value，该集合是线程同步的
 * ---HashMap
 * 底层是哈希表数据结构，可以存入NULL作为Key或者Value，该集合是线程不同步的
 * ---TreeMap
 * 底层结构是二叉树结构，线程不同步，可以用于给map集合中的Key进行排序
 *
 * **/
public class MapDemo {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String,String>();
        map.put("01","zhangsan1");
        map.put("02","zhangsan2");
        map.put("03","zhangsan3");

        System.out.println("containsKey "+ map.containsKey("022"));
//        System.out.println("remove "+ map.remove("02"));
        sop("get: "+ map.get("023"));

        map.put(null,"haha");
        sop("get: "+map.get(null));

        sop("values " + map.values());

        sop(map.put("01","zhangsan1"));//put方法返回被覆盖的那个值
        sop(map.put("01","wangyu"));//put方法返回被覆盖的那个值

        System.out.println(map);

    }
    public static void sop(Object obj){
        System.out.println(obj);
    }
}
