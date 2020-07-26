package com.yiwang.javalearningbasic.phase2;

class Fu{
    int n = 1;

    void walk (){
        System.out.println("Fu walk" + n);
    }

}

class Zi extends Fu {
    void walk(){
        System.out.println("Zi walk" + n);
    }
    void talk (){
        System.out.println("Zi talk" + n);
    }
}

public class JavaExtends extends Fu {
    public static void main(String[] args) {
        Fu fu = new Zi();
        fu.walk();
//        JavaExtends javaExtends = new JavaExtends();
//        System.out.println(javaExtends instanceof Fu);
    }
}
