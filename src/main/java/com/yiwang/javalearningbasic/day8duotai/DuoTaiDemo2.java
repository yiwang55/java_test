package com.yiwang.javalearningbasic.day8duotai;
/*
* 基础班学生
*       学习 睡觉
* 高级班学生
*       学习 睡觉
*
* */
abstract class Student{
   public abstract void study();
   public void sleep(){
       System.out.println("tangzheshui");
   }
}

class BaseStudent extends Student{
    @Override
    public void study() {
        System.out.println("base study");
    }

    @Override
    public void sleep() {
        System.out.println("zuozheshui");
    }
}

class AdvStudent extends Student{
    @Override
    public void study() {
        System.out.println("adv study");
    }
}
class DoStudent{
    public void doSome(Student stu){
        stu.sleep();
        stu.study();
    }
}

public class DuoTaiDemo2 {
    public static  void main(String[] args){
//    BaseStudent bs = new BaseStudent();
//    bs.study();
//    bs.sleep();
//    AdvStudent as = new AdvStudent();
//    as.study();
//    as.sleep();
        DoStudent ds = new DoStudent();
        ds.doSome(new BaseStudent());
        ds.doSome(new AdvStudent());
    }

}
