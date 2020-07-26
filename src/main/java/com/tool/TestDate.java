package com.tool;

import java.text.DateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance();//日期格式，精确到日
        String format = df.format(date);
        System.out.println(format);
    }
}
