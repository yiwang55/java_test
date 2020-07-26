package com.yiwang.javalearningbasic.phase2;

public class SingleLanHanShi {
    private SingleLanHanShi(){}
    //延迟加载
    private static SingleLanHanShi singleLanHanShi = null;
    public  static SingleLanHanShi getInstance(){
        if (singleLanHanShi == null){
            synchronized(SingleLanHanShi.class){
                if (singleLanHanShi == null){
                    /*这里是两行代码，可能会出现线程安全问题，这里可以加锁避免安全问题*/
                    singleLanHanShi = new SingleLanHanShi();
                }
            }
        }
        return singleLanHanShi;
    }
}

class TestDemo1{
    public static void main(String[] args) {
        SingleLanHanShi singleLanHanShi = SingleLanHanShi.getInstance();
        SingleLanHanShi singleLanHanShi1 = SingleLanHanShi.getInstance();

        System.out.println(singleLanHanShi == singleLanHanShi1);
    }
}
