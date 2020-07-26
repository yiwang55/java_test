package com.yiwang.javalearningphase2.array;

public class HomeWork1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3};
        String b[] = new String[10];

        for (int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
        System.out.println("----------------------");
        for (int i=0;i<10;i++){
            b[i] = "hello" + i;
        }
        System.out.println("----------------------");
        for (int k=0;k<b.length;k++){
            System.out.println(b[k]);
        }

//TBD        System.arraycopy();
//
//        Integer int
//        Long long
//        Double double
//        Short short

    }
}
