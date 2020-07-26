package com.yiwang.javalearningbasic.day9;

class Outer2{
    int x = 3;

    void method(int a ){
        int y = 4;
        class  Inner{
            void fuction(){
                System.out.println(a);
            }
        }
        new Inner().fuction();
    }
}
public class InnerClassDemo3 {

 public static void main(String[] args){
    Outer2 out = new Outer2();
    out.method(7);//栈内存中 运行完就出栈了
    out.method(8);
 }
}
