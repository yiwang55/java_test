package com.yiwang.javalearningbasic.day16Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args){
        Map<Student,String> map = new HashMap<Student,String>();

        map.put(new Student("zhangsan",19),"1111");
        map.put(new Student("zhangsan",19),"2222");
        map.put(new Student("zhangsan1",12),"2222");
        map.put(new Student("zhangsan2",34),"3333");
        map.put(new Student("zhangsan2",34),"3333");

        //第一种取出方式 keySet
//        Iterator<Student> it = map.keySet().iterator();
//
//        while(it.hasNext()){
//            Student student = it.next();
//            String addr = map.get(student);
//            System.out.println(student + "...."+addr);
//        }

        //第二种取出方式 entrySet
        Iterator<Map.Entry<Student,String>> it1 = map.entrySet().iterator();

        while(it1.hasNext()){
            Map.Entry<Student,String> me = it1.next();
            Student s = me.getKey();
            String addr = me.getValue();

            System.out.println(s + "...."+addr);
        }
    }
}
class Student implements Comparable<Student>{
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        int num = new Integer(this.age).compareTo(new Integer(s.age));
        if (num == 0){
            return this.name.compareTo(s.name);
        }
        return num;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return name + "：" + age;
    }

    @Override
    public int hashCode() {
        return name.hashCode()+age*34;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student))
            throw new RuntimeException("not Student instance");
        Student s = (Student)obj;
        return this.name.equals(s.name) && this.age == s.age;

    }
}
