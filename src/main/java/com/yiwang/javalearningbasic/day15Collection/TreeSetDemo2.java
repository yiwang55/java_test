package com.yiwang.javalearningbasic.day15Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *  *              当元素自身不具备比较性，或者比较性不是所需要的
 *              这是需要让容器自身具备比较性
 *              在集合初始化时，就有了比较方式。
 *              **/

class MyCompare implements Comparator{
    public int compare(Object obj1,Object obj2){
        Student s1 = (Student)obj1;
        Student s2 = (Student)obj2;
        int num = s1.getName().compareTo(s2.getName());
        if(num==0)
            return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
        return num;
    }

}
public class TreeSetDemo2 {
    public static void main(String[] args){
        TreeSet ts = new TreeSet(new MyCompare());
        ts.add(new Student("lisi01",22));
        ts.add(new Student("lisi01",23));
        ts.add(new Student("lisi02",23));
        ts.add(new Student("lisi03",24));
        ts.add(new Student("lisi04",25));
        ts.add(new Student("lisi04",30));

        Iterator it = ts.iterator();
        while (it.hasNext()){
            Student stu = (Student)it.next();
            sop(stu.getName()+"..."+stu.getAge());
        }
    }
    public static void sop(Object obj){
        System.out.println(obj);
    }
}
