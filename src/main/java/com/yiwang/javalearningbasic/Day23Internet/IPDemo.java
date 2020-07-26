package com.yiwang.javalearningbasic.Day23Internet;
import java.net.InetAddress;

public class IPDemo{
    public static void main(String[] args) throws Exception{
        InetAddress i = InetAddress.getLocalHost();
//        System.out.println(i);
//        System.out.println(i.getHostAddress());
//        System.out.println(i.getHostName());

//            InetAddress ia = InetAddress.getByName("192.168.0.11");
        InetAddress ia = InetAddress.getByName("www.baidu.com");
        System.out.println(ia.getHostAddress());
        System.out.println(ia.getHostName());
    }
}
