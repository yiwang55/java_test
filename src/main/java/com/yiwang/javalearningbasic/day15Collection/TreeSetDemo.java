package com.yiwang.javalearningbasic.day15Collection;

import java.util.Iterator;
import java.util.TreeSet;



/**
 * Set:元素是无序的（存入和取出的顺序不一定一致），元素不可以重复
 * --HashSet：底层数据结构式hash表
 * --TreeSet: 可以对set集合中的元素进行排序（按照ascll码）,
 *              底层数据结构为二叉树
 *              保证元素唯一性的依据：
 *              compareTo方法return 0.
 *
 *              TreeSet排序的第一种方式，让元素自身具备比较性，元素需要实现CompareTo接口，覆盖compareTo方法
 *              这种方式也称为元素的自然顺序，或者默认顺序
 *
 *              TreeSet排序的第二种方式
 *              当元素自身不具备比较性，或者比较性不是所需要的
 *              这是需要让集合自身具备比较性
 *              在集合初始化时，就有了比较方式。
 * Set集合的功能和Collection是一致的
 *
 * **/

class  Student implements Comparable{//该接口强制让学生具备比较性
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    Student(String name,int age){
        this.name= name;
        this.age = age;
    }
    public int compareTo(Object obj){
        if (!(obj instanceof  Student))
            throw new RuntimeException("not Student Object");
        Student s = (Student)obj;
//        System.out.println(this.name+"..compareto.."+ s.name);
        if (this.age > s.age)
            return 1;
        if (this.age == s.age){
            this.name.compareTo(s.name);
            return 0;}

     return -1;
    }
}
public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet ts = new TreeSet();
//        ts.add("cba");
//        ts.add("abcd");
//        ts.add("aaa");
//        ts.add("Dbca");
        ts.add(new Student("lisi02",22));
        ts.add(new Student("lisi02",23));
        ts.add(new Student("lisi03",24));
        ts.add(new Student("lisi04",25));
        ts.add(new Student("lisi05",25));

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
