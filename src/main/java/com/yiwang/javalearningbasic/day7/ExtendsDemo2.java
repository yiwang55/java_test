package com.yiwang.javalearningbasic.day7;

//this代表本类对象的引用
//super代表父类对象的引用

class Fu{
     int num =4;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    void show(){
        System.out.println("Fu show");
    }
    void speak(){
        System.out.println("VB");
    }
}
class Zi extends Fu{
//    int num = 5;
//    void show(){
////        System.out.println(num);
//        System.out.println(this.num);
//    }
    void show(){
        System.out.println("Zi show");
    }
    void speak(){
        System.out.println("JAVA");
    }
}
public class ExtendsDemo2 {
public static void main(String[] args){
    Zi z = new Zi();
    z.show();
//    System.out.println(z.num +"........."+z.num2);
}

}

class Tel{
    void show(){
        System.out.println("number");
    }
}

class NewTel extends Tel{
    @Override
    void show() {
//        System.out.println("number");
        super.show();
        System.out.println("name");
        System.out.println("pic");
    }
}