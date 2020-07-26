package com.yiwang.javalearningbasic.day13String;

/**
 * Created by yiwang on 2018/6/3.
 */
public class StringMethodDemo {

    public static void method_7(){
        //转换，去除空格，比较
        String s = "      aBC de fg    ";
        sop(s.toUpperCase());
        sop(s.toLowerCase());
        sop(s.trim());
        String s1 = "acc";
        String s2 = "aaa";
        sop(s1.compareTo(s2));
    }

    public static void method_sub(){
        String s = "abcdef";
        sop(s.substring(2));
        sop(s.substring(2,4));
    }

    public static void method_split(){
        String s = "zhangsan,lisi,wangwu";
//切割
        String[]  arr= s. split(",");
        for (int i=0;i<arr.length;i++)
            sop(arr[i]);
    }

    public static void method_replace()
    {
        //替换方法
          String s = "hello java";

        String s1 = s.replace('a','n');

        sop("s = " + s);
        sop("s1 = " + s1);
    }

    public static void method_transfer()
    {
/* 转换方法*/
        char[] arr = {'a','b','c','d','e','f'};

        String s = new String(arr);
        sop("s = " + s);

        String s1 = "zxcvbnm";
        char[] chs = s1.toCharArray();
        for (int x = 0;x<chs.length;x++)
        {
            sop("ch = " + chs[x]);
        }
    }

    public static void method_is()
    {
        String str = "ArrayDemo.java";
/* 判断方法*/
        sop(str.startsWith("Array"));
        sop(str.endsWith(".java"));
        sop(str.contains("Demo"));
        sop(str.equals("ArrayDemo.java"));
        sop(str.equalsIgnoreCase("arraydemo.Java"));//忽略大小写匹配是否相等

    }

    public static void method_get(){
        String str = "abcdeakpf";
/*获取方法*/
        sop(str.length());
        sop(str.charAt(4));
        sop(str.indexOf('m',3));
        sop(str.lastIndexOf("a"));
    }

    public static void sop(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args){
        method_7();
//        method_sub();
//        method_split();
//        method_replace();
//            method_is();
//            method_get();
//        String s1 = "abc";
//        String s2 = new String("abc");
//
//        String s3 = "abc";
//
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
    }
}
