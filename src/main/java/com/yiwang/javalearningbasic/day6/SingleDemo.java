package com.yiwang.javalearningbasic.day6;

class Single{
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
//饿汉式
    private Single(){}
    private static Single s = new Single();
    public static Single getInstance(){
        return s;
    }
}
public class SingleDemo {
public static void main(String[] args){
    Single ss = Single.getInstance();

}
}

class Student{
    private int age;
    private Student(){};
    private static Student s = new Student();
    public static Student getStudent() {
        return s;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
