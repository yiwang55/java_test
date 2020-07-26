package com.yiwang.javalearningbasic.day15Collection;


interface Inter<T>{
    void show(T t);
}

//class InterImpl implements Inter<String>{
//    public void show(String t){
//        System.out.println("show: "+ t);
//    }
//}
class InterImpl<T> implements  Inter<T>{
    @Override
    public void show(T t) {
        System.out.println("show: "+ t);
    }
}

public class GenericDemo5 {
    public static void main(String[] args){
        InterImpl i= new InterImpl();
        i.show(4);
        i.show("haha");
    }
}
