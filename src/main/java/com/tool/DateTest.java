package com.tool;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateTest{
    public static void main(String[] args) {
        System.out.println(new Date(1593964800000L));
        System.out.println(toZonedDateTime(new Date(1593964800000L)));
    }

    public static ZonedDateTime toZonedDateTime(Date utilDate) {
        if (utilDate == null) {
            return null;
        }
        final ZoneId systemDefault = ZoneId.systemDefault();
        return ZonedDateTime.ofInstant(utilDate.toInstant(), systemDefault);
    }
}
