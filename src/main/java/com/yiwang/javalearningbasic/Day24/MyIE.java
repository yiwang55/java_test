package com.yiwang.javalearningbasic.Day24;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MyIE {
    public static void main(String[] args) throws IOException{
        Socket s= new Socket("192.168.0.143",8080);
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);

        out.println("");
    }
}
