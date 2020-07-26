package com.yiwang.javalearningbasic.phase2;

public class SingleEHanShi {
    private SingleEHanShi(){}
    private static SingleEHanShi singleEHanShi = new SingleEHanShi();

    public static SingleEHanShi getInstance(){
        return singleEHanShi;
    }
}

class TestDemo{
    public static void main(String[] args) {
        SingleEHanShi singleEHanShi = SingleEHanShi.getInstance();
        SingleEHanShi singleEHanShi1 = SingleEHanShi.getInstance();

        System.out.println(singleEHanShi == singleEHanShi1);
    }
}
