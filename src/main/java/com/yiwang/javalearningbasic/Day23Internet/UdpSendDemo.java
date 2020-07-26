package com.yiwang.javalearningbasic.Day23Internet;
import java.net.*;
public class UdpSendDemo {
    public static void main(String[] args) throws Exception{
        //1.创建UDP服务，通过DatagramSocket对象
        DatagramSocket s = new DatagramSocket();
        //2. 确定数据，并封装成数据包。DatagramPacket(byte buf[], int length,InetAddress address, int port)
        byte[] buf = "udp Coming".getBytes();
        DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("127.0.0.1"),10000);
        s.send(dp);
        s.close();
    }
}
