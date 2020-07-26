package com.yiwang.javalearningbasic.day14Collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 将自定义对象作为元素存入ArrayList中，并去除重复元素
 * 比如： 存人对象。同姓名同年龄  视为同一个人 为重复元素。
 * **/
class Person{
    private String name;
    private int age;

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

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Person)){
            return false;
        }
        Person p = (Person) obj;

        return this.name.equals(p.name) && this.age == p.age;
    }
        }

public class ArrayListTest1 {

    public static ArrayList method_distinctPerson(ArrayList al){
        ArrayList arrayList = new ArrayList();

//        for (ListIterator it  = al.listIterator();it.hasNext();){
//            Person p = (Person)it.next();
//            if(!p.equals(it.next())){
//                arrayList.add((Person)it.next());
//            }
//        }
        Iterator it = al.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            if (!arrayList.contains(obj)){
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void main(String[] args){

        ArrayList al = new ArrayList();

        al.add(new Person("zhangsan",10));
        al.add(new Person("zhangsan",10));
        al.add(new Person("zs",10));
        al.add(new Person("lisi",10));
        al.add(new Person("lisi",10));


        al = method_distinctPerson(al);

        Iterator it = al.iterator();
        while(it.hasNext()){
            Person p =(Person)it.next();
            sop(p.getName()+" + "+p.getAge());
        }

    }
    public static void sop(Object obj){
        System.out.println(obj);
    }
}
