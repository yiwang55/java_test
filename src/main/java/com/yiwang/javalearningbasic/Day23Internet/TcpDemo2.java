package com.yiwang.javalearningbasic.Day23Internet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class TcpClient2{
    public static void main(String[] args)throws IOException{
        Socket s = new Socket("192.168.0.143",10004);
        OutputStream out = s.getOutputStream();
        out.write("服务端，你好".getBytes());

        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf,0,len));
    }

}
class TcpServer2{
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(10004);
        Socket s = ss.accept();
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+"......connected");
        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf,0,len));

        OutputStream out = s.getOutputStream();
        out.write("收到，你好".getBytes());

        s.close();
        ss.close();
    }
}
public class TcpDemo2 {
    public static void main(String[] args){

    }
}
