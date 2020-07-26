package com.yiwang.javalearningbasic.day7;

abstract class Employee{
    private String name;
    private String id;
    private double salary;
    Employee(String name,String id,double salary){
        this.id=id;
        this.name= name;
        this.salary = salary;
    }
    public abstract void work();
}
class Manager extends Employee{
    private int bonus;
    Manager(String name,String id,double salary,int bonus){
        super(name,id,salary);
        this.bonus= bonus;
    }
    public void work(){
        System.out.println("manager work");
    }
}

class Pro extends Employee{
    Pro(String name,String id,double salary,int bonus){
        super(name,id,salary);
    }
    public void work(){
        System.out.println("pro work");
    }
}

public class AbstractTest {
    public static void main(String[] args){

    }
}
