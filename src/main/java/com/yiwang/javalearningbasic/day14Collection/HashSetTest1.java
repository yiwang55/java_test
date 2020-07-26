package com.yiwang.javalearningbasic.day14Collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by yiwang on 2018/6/7.
 */
public class HashSetTest1 {
    public static void sop(Object obj){
        System.out.println(obj);
    }
    public  static void main(String[] args){
        HashSet hs = new HashSet();

        hs.add(new Person1("a1",11));
        hs.add(new Person1("a2",12));
//        hs.add(new Person1("a2",12));
        hs.add(new Person1("a3",13));

        sop(hs.contains(new Person1("a1",11)));

        Iterator it = hs.iterator();
        while(it.hasNext()){
            Person p = (Person)it.next();
            sop(p.getName()+"..."+p.getAge());
        }
    }
}
