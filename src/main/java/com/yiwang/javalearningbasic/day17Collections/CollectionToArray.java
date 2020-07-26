package com.yiwang.javalearningbasic.day17Collections;


import com.yiwang.javalearningbasic.SOP;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by yiwang on 2018/6/21.
 */
public class CollectionToArray extends SOP {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("abc1");
        al.add("abc2");
        al.add("abc3");

        String[] arr = al.toArray(new String[0]);
//        String[] arr1 = al.toArray(new String[5]);
        String[] arr1 = al.toArray(new String[al.size()]);//数值长度为size，为最优数组。
        sop(Arrays.toString(arr));
        sop(Arrays.toString(arr1));
    }
    /**
     * 集合变数组的意义
     *
     * 限定对元素的操作,不需要进行增删（数组不能增删）（集合可以增删）
     * **/
//    public static void sop(Object obj){
//        System.out.println("obj= " + obj);
//    }
}
