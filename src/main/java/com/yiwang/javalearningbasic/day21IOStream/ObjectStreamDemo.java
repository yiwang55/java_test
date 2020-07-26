package com.yiwang.javalearningbasic.day21IOStream;

import java.io.*;

class Person implements Serializable{
    private String name;
    transient private int age;

    Person(String name,int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name +":"+ age;
    }
}

public class ObjectStreamDemo {
    public static void main(String[] args)throws Exception{
//        writeObj();
        readObj();
    }

    public static void readObj() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
        Person p = (Person)ois.readObject();
        System.out.println(p);
        ois.close();
    }
    public static void writeObj(){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
            oos.writeObject(new Person("lisi",23));
            oos.close();
        }catch (IOException e){
                throw new RuntimeException("写入失败");
        }

    }
}
