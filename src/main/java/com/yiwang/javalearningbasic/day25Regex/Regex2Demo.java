package com.yiwang.javalearningbasic.day25Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2Demo {
    public static void main(String[] args){
            getDemo();
    }
    public static void getDemo(){
        String str = "ming tian jiu yao fang jia le, da jia .";
//        str = "123456";
        String reg= "[a-z]{3}";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);
        System.out.println(m.matches());
    }
}
