package com.yiwang.javalearningbasic.day17Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by yiwang on 2018/6/20.
 */
public class CollectionsDemo {
    public static void main(String[] args){
//        sortDemo();
//        maxDemo();
        binarySearchDemo();
    }
    public static void binarySearchDemo(){
        List<String> list = new ArrayList<String>();

        list.add("abcd");
        list.add("aaa");
        list.add("z");
        list.add("kkkkk");
        list.add("qq");
        list.add("zz");
        Collections.sort(list);
        sop(list);
        int index = Collections.binarySearch(list,"aaa");
        sop("index = " + index);
    }
    public static void maxDemo(){
        List<String> list = new ArrayList<String>();

        list.add("abcd");
        list.add("aaa");
        list.add("z");
        list.add("kkkkk");
        list.add("qq");
        list.add("zz");
        Collections.sort(list);
        sop(list);
        String max = Collections.max(list,new StrLenComparator());
        sop("max = " + max);

    }
    public static void sortDemo(){
        List<String> list = new ArrayList<String>();

        list.add("abcd");
        list.add("aaa");
        list.add("z");
        list.add("kkkkk");
        list.add("qq");
        list.add("zz");

        sop(list);

        Collections.sort(list,new StrLenComparator());

        sop(list);
    }
    public static void sop(Object object){
        System.out.println(object);
    }
}
class StrLenComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        if(o1.length() < o2.length())
            return -1;
        if(o1.length() > o2.length())
            return 2;
        if(o1.length() == o2.length())
            return o1.compareTo(o2);


        return 0;
    }
}
