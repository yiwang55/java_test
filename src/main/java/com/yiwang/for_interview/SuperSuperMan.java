package com.yiwang.for_interview;

class Hero {
    public String name() {
        return "超级英雄";
    }
}
class SuperMan extends Hero{
    @Override
    public String name() {
        return "超⼈";
    }
    public Hero hero() {
        return new Hero();
    }
}
public class SuperSuperMan extends SuperMan {
    public String name() {
        return "超级超级英雄";
    }
    @Override
    public SuperMan hero() {
        return new SuperMan();
    }

    public static void main(String[] args) {
        SuperSuperMan superSuperMan = new SuperSuperMan();
        System.out.println(superSuperMan.name());
    }
}
