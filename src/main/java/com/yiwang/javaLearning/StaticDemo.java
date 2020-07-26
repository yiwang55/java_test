package com.yiwang.javaLearning;

class Person2{
    String name;
   static String country = "CN";
    public  void  show(){
        System.out.println(name + "::" + country);
    }
}
class StaticDemo {
    public  static  void main(){
//        Person2 p =new Person2();
//        p.name = "zhangsan";
//        p.show();
    System.out.println(Person2.country);
    }
}
