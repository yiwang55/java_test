package com.yiwang.javalearningbasic.day25Regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest2 {
    public static void main(String[] args) throws Exception{
    getMails();
    }
    public static void getMails_1() throws Exception{
        URL url = new URL("");
        URLConnection conn = url.openConnection();
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String line = null;
        String mailreg = "\\w+@\\w+(\\.\\w+)+";

        Pattern p = Pattern.compile(mailreg);

        while((line = bufIn.readLine())!= null){
            Matcher m = p.matcher(line);
            while(m.find()) {
                System.out.println(line);
            }
        }
    }
    public static void getMails() throws Exception{
        BufferedReader bufr = new BufferedReader(new FileReader("mail.txt"));
        String line = null;
        String mailreg = "\\w+@\\w+(\\.\\w+)+";

        Pattern p = Pattern.compile(mailreg);

        while((line = bufr.readLine())!= null){
            Matcher m = p.matcher(line);
            while(m.find()) {
                System.out.println(line);
            }
        }
    }
}
