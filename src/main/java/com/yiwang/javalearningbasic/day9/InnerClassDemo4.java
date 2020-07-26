package com.yiwang.javalearningbasic.day9;

abstract class AbsDemo{
    abstract void show();
}

class Outer3{

    int x =3;

//    class Inner extends AbsDemo{
//        void show(){
//            System.out.println("show : " + x);
//        }
//    }
    public void function(){
        //new Inner().show();
        new AbsDemo(){
            @Override
            void show() {
                System.out.println("show : " + x);
            }
        }.show();
    }
}
public class InnerClassDemo4 {
    public static void main(String[] args){
        Outer3 out = new Outer3();
        out.function();
    }
}
