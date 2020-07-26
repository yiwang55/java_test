package com.yiwang.javalearningbasic.day25Regex;

/**
 * 正则表达式
 * 1.匹配
 * 2.切割
 *
 * 对qq号进行校验
 * **/
public class RegexDemo {
    public static void main(String[] args){
//        splitDemo("zhangsas  lisi  wangwu"," ");
    String str = "wert12312312313ty324234uido13124124ufs";
    replaceAllDemo(str,"\\d{5,}","#");
    String str1 = "erkktyqqquizzzzzzo";
    replaceAllDemo(str1,"(.)\\1+","&");
    }

    public static void replaceAllDemo(String str,String reg,String newStr){
        str = str.replaceAll(reg,newStr);
        System.out.println(str);
    }
    public static void splitDemo(String str,String reg){
//        String str = "zhangsas  lisi  wangwu";
//        String reg = " ";
        String[] arr = str.split(reg);
        System.out.println(arr.length);
        for(String s : arr){
            System.out.println(s);
        }
    }

    public static void checkTel(){
        String tel = "18273132223";
        String reg = "[1][358]\\d{9}";
        System.out.println(tel.matches(reg));
    }
    public static void demo(){
        String str ="b9";
        String reg = "[a-zA-Z]\\d";
        boolean b = str.matches(reg);
        System.out.println(b);

    }
    public static void checkQQ(){
        String qq = "13245";
        String regex = "[1-9]\\d{4,14}";
        boolean flag = qq.matches(regex);
        if (flag){
            System.out.println(qq+ "...is ok");
        }else{
            System.out.println(qq+".......nononono");
        }
    }
    public static void checkQQ_1(){
        String qq= "1231231a12345";
        int len = qq.length();
        if (len>=5&&len<=15){
            if (!qq.startsWith("0")){
                try{long l = Long.parseLong(qq);}catch(NumberFormatException e){
                    System.out.println("出现非法字符");
                }
                /*
                char[] arr = qq.toCharArray();
                boolean flag = true;
                for(int x = 0;x<arr.length;x++)
                {
                    if(!(arr[x]>='0' && arr[x]<='9')){
                        flag = false;
                        break;
                    }
                }
                if (flag)
                {
                    System.out.println("qq:" + qq);
                } else{
                    System.out.println("出现非法字符");
                }*/
            }
            else{
                System.out.println("不能以0开头");
            }
        }else{
            System.out.println("号码长度不正确");
        }
    }
}
