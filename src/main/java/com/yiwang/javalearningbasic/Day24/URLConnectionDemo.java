package com.yiwang.javalearningbasic.Day24;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://localhost:18080/myweb/demo.html");
        URLConnection conn = url.openConnection();
        System.out.println(conn);

        System.out.println(conn.getContent());

        InputStream in = conn.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf,0,len));
    }
}
