package com.yiwang.javalearningbasic.Day24;
import java.net.*;

public class URLDemo {
    public static void main(String[] args)throws Exception{
        URL url = new URL("http://localhost:18080/myweb/demo.html?name=haha&age=30");
        System.out.println("url.getProtocol(): "+url.getProtocol());
        System.out.println("url.getHost(): "+url.getHost());
        System.out.println("url.getPort(): "+url.getPort());
        System.out.println("url.getPath(): "+url.getPath());
        System.out.println("url.getFile(): "+url.getFile());
        System.out.println("url.getQuery(): "+url.getQuery());
    }
}
