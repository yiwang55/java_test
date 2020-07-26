package com.yiwang.javalearningbasic.day15Collection;

class Worker{
}
class Teacher{
}
class Tool{
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
class Utils<QQ>{
    private QQ q;
    public void setObject(QQ q){
        this.q = q;
    }
    public QQ getObject(){
        return q;
    }
}

public class GenericDemo3 {
    public static void main(String[] args){
//        Tool t = new Tool();
//        t.setObject(new Teacher());
//        Worker w = (Worker)t.getObject();
        Utils<Worker> u = new Utils<Worker>();

        u.setObject(new Worker());
        Worker w = u.getObject();
    }
}
