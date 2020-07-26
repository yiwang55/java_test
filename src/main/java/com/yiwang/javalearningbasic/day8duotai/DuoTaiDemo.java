package com.yiwang.javalearningbasic.day8duotai;
/*
* 多态：事物存在多种体现形态
* 人  男人  女人
* 动物 猫 狗
* Cat x = new Cat();
* Animal a = new Cat();
1.多态的体现
    父类的引用指向了自己的子类对象
    父类的引用也可以接受
2.多态的前提
    类与类之间的继承或者类与类之间的实现
    通常还有一个前提：存在覆盖（重写）。
3.多态的好处
    多态的出现大大的提高了程序的扩展性
4.多态的弊端
    虽然能提高了扩展性，但是只能使用父类引用访问父类中的成员
4.多态的应用
* */
/*
* 动物
* 猫，狗
* */
abstract class Animal{
  public abstract void eat();
}

class Cat extends Animal{
    public void eat(){
        System.out.println("chiyu");
    }
    public void catchMouse(){
        System.out.println("zhualaoshu");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("chigutou");
    }
    public void KanJia(){
        System.out.println("kanjia");
    }
}

class Pig extends Animal{
    @Override
    public void eat() {
        System.out.println("siliao");
    }
    public void gongDi(){
        System.out.println("gongdi");
    }
}
public class DuoTaiDemo {
    public static void main(String[] args){

//        function(new Cat());
//        function(new Dog());
//        function(new Pig());
//        Animal a = new Cat();//类型提升，向上转型
//        a.eat();
//        //强制将父类引用，转成子类类型
//        Cat c = (Cat)a;
//        c.catchMouse();


//        System.out.println("");
//        Cat c = new Cat();
//        c.eat();
//
//        Dog d = new Dog();
//        d.eat();
        function(new Dog());
        function(new Cat());
    }
        public static void function(Animal a) {
            a.eat();
            if (a instanceof Cat) {
                Cat c = (Cat) a;
                c.catchMouse();
            }
            else if (a instanceof Dog) {
                Dog c = (Dog) a;
                c.KanJia();
            }
    }
//    public static void function(Cat c){
//        c.eat();
//    }
//    public static void function(Dog d){
//        d.eat();
//    }
//    public static void function(Pig p){
//        p.eat();
//    }
}
