package com.yiwang.javalearningbasic.Day23Internet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class TcpClient{
    public static void main(String[] args) throws IOException{
        //创建客户端的socket服务，指定目的主机和端口
        Socket s = new Socket("192.168.0.143",10003);
        OutputStream out = s.getOutputStream();
        out.write("Tcp coming".getBytes());
        s.close();
    }
}
class TcpServer{
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(10003);
        Socket s = ss.accept();
        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf,0,len));
        s.close();
        ss.close();
    }
        }
public class TcpDemo {
    public static void main(String[] args){

    }
}
