package com.yiwang.javalearningbasic.day14Collection;

import java.util.LinkedList;

/**
*使用LinkedList模拟一个堆栈或者队列的数据结构
*
**/

class  Queue{
    private LinkedList link;

    Queue(){
        link  = new LinkedList();
    }
    public void myAdd(Object obj){
        link.addFirst(obj);
    }
    public Object myGet(){
        return link.removeLast();
    }

    public Boolean isNull() {
        return link.isEmpty();
    }
}
public class LinkListTest {
    public  static void main(String[] args){
        Queue q = new Queue();
        q.myAdd("java01");
        q.myAdd("java02");
        q.myAdd("java03");
        q.myAdd("java04");

        while(!q.isNull()){
            sop(q.myGet());
        }
    }
    public  static  void sop(Object obj){
        System.out.println(obj);
    }
}
