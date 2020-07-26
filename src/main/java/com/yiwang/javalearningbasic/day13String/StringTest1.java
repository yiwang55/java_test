package com.yiwang.javalearningbasic.day13String;

/**
 * Created by yiwang on 2018/6/3.
 */
public class StringTest1 {
    public static void main(String[] args){

        String s = "abkkcdkkefkkskkcdkk";
        sop(sumkk(s));
    }

    public static int sumkk(String s){
        int sumkkappear = 0;
        int kkfirstapper= 0;
        String aftersubstringkk = "";
        while(s.indexOf("kk",kkfirstapper) != -1){
            kkfirstapper = s.indexOf("kk",kkfirstapper)+2;

            sumkkappear++;

        }
        return sumkkappear;
    }
    public static void sop(Object obj){
        System.out.println(obj);
    }
}
