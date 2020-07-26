package com.yiwang.javalearningbasic.day15Collection;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * 泛型：jdk1.5版本后出现的新特性，用于解决安全问题，是一种类型安全机制.
 *
 * 好处
 * 1.将运行时的错误放到编译当中，方便程序员解决问题
 * 2.避免强制转换的麻烦
 *
 * 泛型格式：通过<>来定义操作的引用数据类型
 *
 * **/
public class GenericDemo {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();

        al.add("abc01");
        al.add("abc0094");
        al.add("abc34234");
//        al.add(4);

        Iterator<String> it = al.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s+"...."+s.length());
        }
    }
}
