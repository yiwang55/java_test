package com.yiwang.javalearningbasic.day17Collections;

import com.yiwang.javalearningbasic.SOP;

public class ParamMethodDemo extends SOP {
    public static void main(String[] args){
        show("haha",2,3,4,5,5,6,7,8,9,54,5);
    }
    public static void show(String str, int... arr){
        sop(arr.length);
    }
}
