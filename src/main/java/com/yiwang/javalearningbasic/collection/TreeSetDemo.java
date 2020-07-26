package com.yiwang.javalearningbasic.collection;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Student> treeSet = new TreeSet<>(new StudentComparator());

        Student s1 = new Student("zhangsan",20);
        Student s2 = new Student("lis",29);
        Student s3 = new Student("wangwu",70);
        Student s4 = new Student("zhaoliu",26);
        Student s8 = new Student("zhaoliu",25);
        Student s5 = new Student("wy",25);
        Student s6 = new Student("ccc",24);
        Student s7 = new Student("aaa",21);
        treeSet.add(s1);
        treeSet.add(s3);
        treeSet.add(s2);
        treeSet.add(s4);
        treeSet.add(s5);
        treeSet.add(s6);
        treeSet.add(s7);
        treeSet.add(s8);

        for (Student s: treeSet
             ) {
            System.out.println(s.getName() + " ------ " + s.getAge());
        }
    }
}

