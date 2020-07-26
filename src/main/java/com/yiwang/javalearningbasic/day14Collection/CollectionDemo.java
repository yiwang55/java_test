package com.yiwang.javalearningbasic.day14Collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by yiwang on 2018/6/5.
 */
public class CollectionDemo {
    public static void main(String[] args){
        method_get();
    }
    public static void method_get(){
        ArrayList al = new ArrayList();

        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");


//         Iterator it =  al.iterator();//获取迭代器用于取出集合中的元素
//        while(it.hasNext())
//        {
//        sop(it.next());

        for (Iterator it  = al.iterator();it.hasNext();){
            sop(it.next());
        }//for循环可释放it所占的内存空间
        }

    public static void method_2(){
        ArrayList al1 = new ArrayList();

        al1.add("java01");
        al1.add("java02");
        al1.add("java03");
        al1.add("java04");

        ArrayList al2 = new ArrayList();

        al2.add("java01");
        al2.add("java02");
        al2.add("java05");
        al2.add("java06");

        sop("原集合： "+ al1);
        //sop("size: " + al.size());
        //删除
//        al.remove("java02");
//        al.clear();
//        sop(al);
        //判断
//        sop(al1.contains("java03"));
        al1.retainAll(al2);//取交集
        sop(al1);
    }

    public static void sop(Object obj){
        System.out.println(obj);
    }
}
