package com.yiwang.javalearningbasic.collection;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int num = o1.getAge() - o2.getAge();
        int num1 = num == 0 ? (o1.getName().length() - o2.getName().length()) : num;
        return num1;
    }
}
