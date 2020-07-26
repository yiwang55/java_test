package com.yiwang.javalearningbasic.day14Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args){

        Vector v = new Vector();
        v.add("java01");
        v.add("java02");
        v.add("java03");

        Enumeration en = v.elements();

        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }

}
