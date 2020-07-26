package com.yiwang.javalearningbasic.day18System;

import com.yiwang.javalearningbasic.SOP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo extends SOP {
    public static void main(String[] args){
        Date d = new Date();
        sop(d);
        SimpleDateFormat s =new SimpleDateFormat("yyyy年MM月dd日E hh:mm:ss");
        String time = s.format(d);
        sop(time);
    }
}
