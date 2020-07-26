package com.yiwang.javalearningbasic.day14Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {
    public static void sop(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args){
        ArrayList al  = new ArrayList();

        al.add("java01");
        al.add("java02");
        al.add("java03");

        ListIterator it  = al.listIterator();
        sop(al);
        while(it.hasNext()){
            Object obj = it.next();

            if(obj.equals("java02")){
//                al.add("java008");
//                it.add("java008");
                it.set("java006");
//                it.remove();
            }
//            sop(obj);
        }
        sop("hasNext :" + it.hasNext());
        sop("hasPrevious :" + it.hasPrevious());
        sop(al);
    }
}
