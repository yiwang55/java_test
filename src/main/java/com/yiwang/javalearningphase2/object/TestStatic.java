package com.yiwang.javalearningphase2.object;

public class TestStatic {
    int a;
    static int width;
    static void gg(){
        System.out.println("gg");
    }
    void tt(){
        System.out.println("tt");
    }
    public static void main(String[] args){
        TestStatic hi = new TestStatic();
        TestStatic.width = 2;
        TestStatic.gg(); //gg();
        hi.gg(); // 通过引用也可以访问static 变量或static 方法。不过，一般还
//        是使用类名.static 成员名来访问。
        gg();
    }
}
