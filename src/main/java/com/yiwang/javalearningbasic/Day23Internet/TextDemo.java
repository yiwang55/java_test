package com.yiwang.javalearningbasic.Day23Internet;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class TextClient{
    public static void main(String[] args)throws IOException{
        Socket s = new Socket("192.168.0.143",10001);
        BufferedReader bufr = new BufferedReader(new FileReader("ran.txt"));
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        String line = null;
        while((line = bufr.readLine())!=null){
            out.println(line);
    }

    BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = bufIn.readLine();
        System.out.println(str);

        bufr.close();
        s.close();
    }
}
class TextServer{
    public static void main(String[] args)throws IOException{
        ServerSocket ss = new ServerSocket(10001);
        Socket s = ss.accept();
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+".......connected!");
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(new FileWriter("server.txt",true));
        String line  = null;
        while((line = bufIn.readLine()) != null){
            if("over".equals(line))
                break;
            out.println(line);
        }
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        pw.println("上传成功");
    }
}
public class TextDemo {
}
