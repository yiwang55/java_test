package com.yiwang.javalearningbasic.day15Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo6 {
    public static void main(String[] args){
//        ArrayList<String> al  = new ArrayList<String>();
//        al.add("abc1");
//        al.add("abc2");
//        al.add("abc3");
//
//        ArrayList<Integer> al1  = new ArrayList<Integer>();
//        al1.add(1);
//        al1.add(2);
//        al1.add(3);
//
//
//        printColl(al);
//        printColl(al1);

        ArrayList<Person> al = new ArrayList<Person>();

        al.add(new Person("abc1"));
        al.add(new Person("abc2"));
        al.add(new Person("abc3"));
        printColl(al);

        ArrayList<Student1> al1 = new ArrayList<Student1>();

        al1.add(new Student1("abc--1"));
        al1.add(new Student1("abc--2"));
        al1.add(new Student1("abc--3"));
        printColl(al1);
    }
    /**<? extends Person> 泛型限定
     * ？ 通配符，也可以理解为占位符
     * 泛型的限定
     * ? extends E：可以接受E类型或者子类型，上限定
     * ? super E: 可以接受E类型或者父类型，下限定
     * **/
    public  static void printColl(ArrayList<? extends Person> al){
        Iterator<? extends Person> it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getName());
        }
    }
//    public  static void printColl(ArrayList<?> al){
//        Iterator<?> it = al.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//    }
}
class Person{
    private String name;
    Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Student1 extends  Person {
    Student1(String name) {
        super(name);
    }
}