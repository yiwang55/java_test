package com.yiwang.javalearningbasic.day10;

/*
* 有一个圆形和长方形，
* 都可以获取面积，对于面积如果出现非法的数值，视为是获取面积是出现问题。
* 问题通过 异常来表示。
* 现有对这个程序进行基本设计。
* */

class InvaildValue extends RuntimeException{
    InvaildValue(String  message){
        super(message);
    }
}

interface Shape{
    void getArea();
        }

class Rec implements Shape{
    private int len,wid;

    Rec(int len, int wid)// throws InvaildValue
    {
    if (len <= 0 || wid <= 0)
        throw new InvaildValue("出现非法值");
    else
       this.len = len;
       this.wid = wid;
    }

    public void  getArea(){
        System.out.println(len*wid);
    }
}

class Circle implements Shape{
    private int radius;
    public static final double PI = 3.14;

    Circle(int radius){
        if (radius<=0)
            throw new InvaildValue("出现非法值！");
        this.radius = radius;
    }
    public void  getArea(){
        System.out.println(radius* radius* PI);
    }
}
public class ExceptionTest {
    public static void main(String[] args){
            Rec r = new Rec(3,4);
            r.getArea();

            Circle c = new Circle(-8);
            c.getArea();
        System.out.println("over");

    }
}
