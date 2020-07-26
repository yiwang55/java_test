package com.yiwang.javalearningbasic.day17Collections;

import com.yiwang.javalearningbasic.SOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 高级for循环
 *
 * 格式
 * for(数据类型 变量名:集合名)
 * for(String s:al)
 *
 * 只能对集合进行遍历
 * 只能获取几何元素，但是不能对集合进行操作
 *
 * 迭代器除了遍历，还可以进行remove集合中元素的动作；
 * 如果使用ListIterator，还可以在遍历过程中对集合进行增删改查的操作
 *
 *高级for局限性，必须有遍历的目标
 *
 * 遍历数组的时候，还是希望用传统for循环，因为传统for可以定义角标
 * **/
public class ForEachDemo extends SOP {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();

        al.add("abc1");
        al.add("abc2");
        al.add("abc3");

        for(String s:al){
//            s = "kk";
            sop(s);
        }
        sop(al);

         int[] arr = {3,2,5,6};
         for (int i : arr){
             sop(i);
         }

         //KeySet
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(3,"c");

        Set<Integer> keySet = hm.keySet();
        for(Integer i :keySet){
            sop(i +">>>>"+ hm.get(i));
        }

        //EntrySet

        Set<Map.Entry<Integer,String>> entrySet = hm.entrySet();

        for (Map.Entry<Integer,String> me : hm.entrySet()){
            sop(me.getKey()+">>>>>"+me.getValue());
        }
//        Iterator<String> it = al.iterator();
//        while (it.hasNext()){
//            sop(it.next());
//        }
    }
}
