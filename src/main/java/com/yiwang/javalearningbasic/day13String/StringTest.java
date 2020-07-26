package com.yiwang.javalearningbasic.day13String;

/**
 * Created by yiwang on 2018/6/3.
 */
public class StringTest {

    public static void sop(String str){
    System.out.println(str);
}
    public static void main(String[] args){
        String s = "   ab cd    ";
//        sop(s);
//        sop(MyTrim(s));
//        sop(s.);
        sop(reverseString(s));
        sop(reverseString(s,6,9));
    }

    public static String reverseString(String s,int start,int end){
        char[] arr = s.toCharArray();

        reverse(arr,start,end);
        return  new String(arr);
    }
    public static String reverseString(String s){
        return reverseString(s,0,s.length());
    }

    public static void reverse(char[] arr,int x, int y){
        for (int start = x,end = y-1;start<end;start++,end--){
            swap(arr,start,end);
        }
    }
    private static void swap(char[] arr,int x,int y){
        char temp = arr[x];
        arr[x] =arr[y];
        arr[y] = temp;
    }

    public static String MyTrim(String str){
        int start= 0,end = str.length()-1;

        while(start<=end && str.charAt(start)==' ')
            start++;
        while(start<=end && str.charAt(end)==' ')
            end--;
        return str.substring(start,end+1);
    }
}
