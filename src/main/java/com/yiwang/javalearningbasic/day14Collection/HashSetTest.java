package com.yiwang.javalearningbasic.day14Collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by yiwang on 2018/6/7.
 */

class Person1{
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

    Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Person)){
            return false;
        }
        Person1 p = (Person1) obj;

        return this.name.equals(p.name) && this.age == p.age;
    }

    public int hashCode(){
        return name.hashCode()+age;
    }
}

public class HashSetTest {
    public static void sop(Object obj){
        System.out.println(obj);
    }
    public  static void main(String[] args){
        HashSet hs = new HashSet();

        hs.add(new Person1("a1",11));
        hs.add(new Person1("a2",12));
        hs.add(new Person1("a2",12));
        hs.add(new Person1("a3",13));

        Iterator it = hs.iterator();
        while(it.hasNext()){
            Person p = (Person)it.next();
            sop(p.getName()+"..."+p.getAge());
        }
    }
}
