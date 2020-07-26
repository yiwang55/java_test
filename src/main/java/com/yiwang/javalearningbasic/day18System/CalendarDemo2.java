package com.yiwang.javalearningbasic.day18System;

import com.yiwang.javalearningbasic.SOP;

import java.util.Calendar;

/**
 * Created by yiwang on 2018/6/22.
 */
public class CalendarDemo2 extends SOP {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();

//        c.set(2013,3,3);
//        c.add(Calendar.YEAR,4);
        c.add(Calendar.MONTH,-18);
        printCalendar(c);
    }

    public static void printCalendar(Calendar c){
        sop(c.get(Calendar.YEAR)+"年");
        sop(c.get(Calendar.MONTH)+1+"月");
        sop(c.get(Calendar.DAY_OF_MONTH)+"日");
        sop("星期"+c.get(Calendar.DAY_OF_WEEK));
    }
}
