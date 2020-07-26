package com.yiwang.javalearningbasic.day18System;

import com.yiwang.javalearningbasic.SOP;

import java.util.Calendar;

/**
 * Created by yiwang on 2018/6/22.
 */
public class CalendarDemo extends SOP {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        sop(c.get(Calendar.YEAR)+"年");
        sop(c.get(Calendar.MONTH)+1+"月");
        sop(c.get(Calendar.DAY_OF_WEEK)+"日");
        sop("星期"+c.get(Calendar.DAY_OF_WEEK));

    }
}
