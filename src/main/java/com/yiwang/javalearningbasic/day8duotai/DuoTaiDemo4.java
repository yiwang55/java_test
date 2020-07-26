package com.yiwang.javalearningbasic.day8duotai;

/*
* 需求
* 电脑运行实例
* 电脑运行基于主板
* */

interface PCI{
    void open();
    void close();
}
class MainBoard{
    public void run(){
        System.out.println("MainBoard run");
    }
    public void usePCI(PCI p)//PCI p = new NetCard()
    // 接口型引用指向自己的子类对象
    {
        if (p!=null) {
            p.close();
            p.open();
        }
    }
}
/*class MainBoard{
    public void  run(){
    System.out.println("MainBoard run");
    }
    public void useNetCard(NetCard c){
        c.close();
        c.open();
    }

}*/
class NetCard implements PCI{
    public void open(){
        System.out.println("NerCard open");
    }
     public void close(){
        System.out.println("NerCard close");
    }
}

class SoundCard implements PCI{
    public void open(){
        System.out.println("SoundCard open");
    }
    public void close(){
        System.out.println("SoundCard close");
    }
}

public class DuoTaiDemo4
{
    public static void main(String[] args){
        MainBoard mb = new MainBoard();
//        mb.run();
//        mb.useNetCard(new NetCard());
//    mb.usePCI(null);
//        mb.usePCI(new NetCard());
    mb.usePCI(new SoundCard());
    }
}
