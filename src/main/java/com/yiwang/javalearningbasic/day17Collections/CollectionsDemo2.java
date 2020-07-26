package com.yiwang.javalearningbasic.day17Collections;

import java.util.*;

/**
 * Created by yiwang on 2018/6/21.
 */
public class CollectionsDemo2 {

    public static void sop(Object object){
        System.out.println(object);
    }
    public static void shuffleDemo(){
        List<String> list = new ArrayList<String>();

        list.add("abcd");
        list.add("aaa");
        list.add("zz");
        list.add("kkkkk");

        sop(list);
        Collections.shuffle(list);
        sop(list);

    }
    public static void replaceAllDemo(){
        List<String> list = new ArrayList<String>();

        list.add("abcd");
        list.add("aaa");
        list.add("zz");
        list.add("kkkkk");
        sop(list);
        Collections.replaceAll(list,"aaa","pp");

        Collections.reverse(list);

        Collections.swap(list,1,2);
        sop(list);
    }
    public static void fillDemo(){
        List<String> list = new ArrayList<String>();

        list.add("abcd");
        list.add("aaa");
        list.add("zz");
        list.add("kkkkk");

        sop(list);
        Collections.fill(list,"pp");//全部替换

        sop(list);
    }

    public static void orderDemo(){
        TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new StrLenComparator()));

        ts.add("abcde");
        ts.add("aaa");
        ts.add("kkk");
        ts.add("c");

        Iterator it = ts.iterator();
        while(it.hasNext()){
            sop(it.next());
        }
    }


    public static void main(String[] args){
        shuffleDemo();
    }
}
//class StrComparator implements Comparator<String>{
//    @Override
//    public int compare(String o1, String o2) {
//        return 0;
//    }
//}

