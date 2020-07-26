package com.yiwang.javalearningbasic.day18System;


import com.yiwang.javalearningbasic.SOP;

public class SystemDemo extends SOP {
    public static void main(String[] args){
//        Properties prop = System.getProperties();

        System.setProperty("myKey","myValue");

        String value = System.getProperty("os.name");
        sop(value);
//        for(Object obj : prop.keySet()){
//            String value = (String)prop.get(obj);
//            sop(value);
//        }

    }
}
