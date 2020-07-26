package com.yiwang.javalearningbasic.day9;

/*
* 毕老师用电脑上课
* 电脑蓝屏
* 电脑冒烟
* */

class LanPingException extends Exception{
    LanPingException(String message){
        super(message);
    }
}
class MaoYanException extends RuntimeException{
    MaoYanException(String message){
        super(message);
    }
}
class NoPlanException extends Exception{
    NoPlanException(String message){
        super(message);
    }
}

class Compter{
    private int state = 3;
       public void run()throws LanPingException,MaoYanException
       {
           if(state==2)
               throw new LanPingException("蓝屏啦");
           if (state==3)
               throw new MaoYanException("冒烟了");
           System.out.println("电脑运行");
       }
       public void restart(){
           state=1;
           System.out.println("电脑重启");
       }
}
class Teacher{
    private String name;
    private Compter cmpt;
    Teacher(String name){
        this.name= name;
        cmpt = new Compter();
    }
    public void prelect() throws NoPlanException
    {
        try{
            cmpt.run();
            System.out.println("讲课");
        }
        catch (LanPingException e){
            cmpt.restart();
        }
        catch (MaoYanException e) {
            test();
            throw new NoPlanException("课时无法继续"+e.getMessage());
        }
        System.out.println("讲课");
    }
    public void test(){
        System.out.println("练习");
    }
}
public class ExceptionTest {
    public static void main(String[] args){
        Teacher t = new Teacher("毕老师");
        try{
            t.prelect();
        }catch (NoPlanException e){
            System.out.println(e.toString());
            System.out.println("换老师或者放假");
        }
    }
}
