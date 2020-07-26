package com.yiwang.javalearningbasic.day15Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 按照字符串长度排序
 * **/

class StringLengthComparator implements Comparator{
    public int compare(Object o1, Object o2){
        if (!(o1 instanceof String) ||!(o2 instanceof String)){
            throw new RuntimeException("not String instance");
        }
        String s1  = (String)o1;
        String s2  = (String)o2;

        int num =  new Integer(s1.length()).compareTo(new Integer(s2.length()));
        if (num == 0)
            return s1.compareTo(s2);

        return num;
    }

}
public class TreeSetTest {
 public static void main(String[] args){
     TreeSet ts = new TreeSet(new StringLengthComparator());

     ts.add("abfdafsdfasdfc");
     ts.add("abcaaad");
     ts.add("abe");
     ts.add("abc");
     ts.add("abcfffffffde");
//     ts.add(1111);

     Iterator it = ts.iterator();
     while (it.hasNext()){
         System.out.println(it.next());
     }
 }
}
