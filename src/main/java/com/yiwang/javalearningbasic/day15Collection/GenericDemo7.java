package com.yiwang.javalearningbasic.day15Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class GenericDemo7 {
    public static void main(String[] args){
        TreeSet<Student1> ts = new TreeSet<Student1>(new Comp());
        ts.add(new Student1("abc03"));
        ts.add(new Student1("abc02"));
        ts.add(new Student1("abc01"));
        ts.add(new Student1("abc06"));

        Iterator<Student1> it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getName());
        }

        TreeSet<Worker1> ts1 = new TreeSet<Worker1>(new Comp());
        ts1.add(new Worker1("wabc--03"));
        ts1.add(new Worker1("wabc--02"));
        ts1.add(new Worker1("wabc--01"));
        ts1.add(new Worker1("wabc--06"));

        Iterator<Worker1> it1 = ts1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next().getName());
        }
    }
}
class Comp implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

//class StuComp implements Comparator<Student1>{
//    @Override
//    public int compare(Student1 o1, Student1 o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}
////
//class WorkerComp implements Comparator<Worker1>{
//    @Override
//    public int compare(Worker1 o1, Worker1 o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}

class  Worker1 extends Person{
    Worker1(String name){
        super(name);
    }
}
