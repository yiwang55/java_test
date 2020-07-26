package com.yiwang.javalearningbasic.day15Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class GenericDemo2 {
    public static void main(String[] args){
        TreeSet<String> ts = new TreeSet<String>(new StrLenComparator());

        ts.add("cbda");
        ts.add("abcaad");
        ts.add("aaaaaaaaaa");
        ts.add("Dbcddda");

        Iterator<String> it = ts.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s+"...."+s.length());
        }
    }
}
class StrLenComparator implements Comparator<String> {
    public int compare(String o1, String o2){
//        int num =  new Integer(o1.length()).compareTo(new Integer(o2.length()));
        int num =  new Integer(o2.length()).compareTo(new Integer(o1.length()));
        if (num == 0)
            return o1.compareTo(o2);

        return num;
    }

}
