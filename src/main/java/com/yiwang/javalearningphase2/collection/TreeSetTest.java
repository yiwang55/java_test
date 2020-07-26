package com.yiwang.javalearningphase2.collection;

import java.util.*;

class Person implements Comparable<Person>{
    private Integer id;
    private String name;
    private String desc;

    public Person(Integer id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

//    @Override
//    public int compareTo(Person o) {
//        int i = this.name.compareTo(o.name);
//        if (i == 0){
//            i= this.desc.compareTo(o.desc);
//        }
//        return i;
//    }

    @Override
    public int compareTo(Person o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(desc, person.desc);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, desc);
    }
}
public class TreeSetTest {
    public static void main(String[] args) {
        Person person1 = new Person(1,"aaa","aaa");
        Person person2 = new Person(2,"aaa","aaa");
        Person person6 = new Person(6,"ggg","ggg");
        Person person3 = new Person(3,"bbb","bbb");
        Person person4 = new Person(4,"ccc","ccc");
        Person person5 = new Person(5,"bbb","bbb");

//        Set<Person> set = new LinkedHashSet<>();
        Set<Person> set = new TreeSet<>();
        set.add(person1);
        set.add(person2);
        set.add(person6);
        set.add(person3);
        set.add(person4);
        set.add(person5);

        for (Person person: set){
        System.out.println(person);
        }
    }

}
