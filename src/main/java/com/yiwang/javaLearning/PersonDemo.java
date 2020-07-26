package com.yiwang.javaLearning;

class Person {
    private int age;//private修飾符

    public void setAge(int a){
//         this.age = age;
        if(a >0 && a <130){
            age = a;
            speak();
        }
        else
            System.out.println("feifa age");
    }
    public int getAge(){
        return age;
    }
    void speak(){
        System.out.println("age = " + age);
    }
}
class PersonDemo{
    public  static void main(String[] args){
        Person p = new Person();
        p.setAge(-20);
//    p.speak();
    }
}