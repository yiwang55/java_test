package com.yiwang.javalearningbasic.day18System;

import com.yiwang.javalearningbasic.SOP;

import java.util.Random;

/**
 * Created by yiwang on 2018/6/22.
 */
public class MathDemo extends SOP {

    public static void show(){
        double d = Math.ceil(12.34);/**ceil返回大于指定数据的最小整数**/
        double d1 = Math.floor(12.34);/**floor返回小于指定数据的最大整数**/
        long l = Math.round(12.54);//四舍五入
        sop(d);
        sop(d1);
        sop(l);

        double d2 = Math.pow(2,3);
        sop(d2);
    }
public static void main(String[] args){
    Random r = new Random();

        for (int x =0;x<10;x++){
            int d = r.nextInt(10)+1;
            sop(d);
        }
}
}
