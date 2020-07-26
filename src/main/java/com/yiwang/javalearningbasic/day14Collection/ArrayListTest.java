package com.yiwang.javalearningbasic.day14Collection;


import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 去除ArrayList中重复元素
 * **/
public class ArrayListTest {

    public static ArrayList method_distinct(ArrayList al){
        ArrayList arrayList = new ArrayList();

        for (ListIterator it  = al.listIterator();it.hasNext();){
            if(!arrayList.contains(it.next())){
                arrayList.add(it.next());
            }

        }
        return arrayList;
    }

    public static void main(String[] args){

        ArrayList al = new ArrayList();

        al.add("java001");
        al.add("java001");
        al.add("java001");
        al.add("java003");
        al.add("java003");

        sop(al);

        sop(method_distinct(al));


    }
    public static void sop(Object obj){
        System.out.println(obj);
    }
}
