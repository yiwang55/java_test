package com.yiwang.javalearningbasic.day9;

interface  Inter{
    void method();
}

class Test {
    static Inter function(){
        return new Inter (){
            public void method() {

                System.out.println("method run");
            }
        };
    }
}
public class InnerClassTest {
    public static  void main(String[] args){

//        Test.function()：Test类中有个静态方法叫function
        //.method():function这个方法运算后返回的结果是个对象，而且是一个Inter类型的对象
        //因为只有Inter类型的对象才能调用method方法

        Test.function().method();

        show(new Inter() {
            @Override
            public void method() {
           System.out.println("method show run");
            }
        });
    }
    public static void show(Inter in){
        in.method();
    }
//    class InnerTest{
//        public static void main(String[] args){
//            new Object(){
//                public void function(){}
//            }
//        }
//    }
}
