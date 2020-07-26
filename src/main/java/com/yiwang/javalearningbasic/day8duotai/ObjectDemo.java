package com.yiwang.javalearningbasic.day8duotai;

/*
Object类中已经提供了对对象是否相同的比较方法

如果要比较没有必要再重新定义
可以使用函数覆盖
* */
class Demo//extends Object;
    //具备Object类里所有的方法
{
    private int num;
    Demo(int num){
        this.num = num;
    }
    public boolean equals(Object obj)//Object obj = new Demo();
    {
        if (obj instanceof Demo) {
            Demo d = (Demo) obj;
            return this.num == d.num;
        } else
            return false;
    }
    public String toString(){
        return "demo:" + num;
    }
//    public boolean compare(Demo d){
//        return this.num == num;
//    }
}
class Person{}
public class ObjectDemo {
    public static void main(String[] args){
        Demo d1=new Demo(4);
        Class c  = d1.getClass();
        System.out.println(c.getName());
//        System.out.println(d1.toString());//哈希值
//        System.out.println(Integer.toHexString(d1.hashCode()));//转十六进制//哈希值
//        System.out.println(d1.getClass());//返回对象的的类

//        Demo d2=new Demo(5);
//        Demo d3 = d1;
//        Person p = new Person();
//        System.out.println(d1.equals(p));//equals 比较的是内存地址
//        System.out.println(d1.equals(d2));
//        System.out.println(d1.equals(d3));

//        Person p1 = new Person();
//        Person p2 = new Person();
//        System.out.println("Person=" + p1.equals(p2));
    }
}
