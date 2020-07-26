package com.yiwang.javalearningbasic.Day23Internet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class Send implements Runnable{
    private DatagramSocket ds;
    Send(DatagramSocket ds){
        this.ds = ds;
    }

    @Override
    public void run() {
        try{
            BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while((line = bufr.readLine())!= null){
                if("886".equals(line))
                    break;
                byte[] buf = line.getBytes();
                DatagramPacket dp = new DatagramPacket(buf,buf.length, InetAddress.getByName("192.168.0.143"),10002);
                ds.send(dp);
            }
        }catch (Exception e){
                throw new RuntimeException("发送端失败！");
        }
    }
}
class Rece implements Runnable{
    private DatagramSocket ds;
    Rece(DatagramSocket ds){
        this.ds = ds;
    }

    @Override
    public void run() {
        try{
            while(true){
                byte[] buf = new byte[1024];
                DatagramPacket dp = new DatagramPacket(buf,buf.length);
                ds.receive(dp);

                String ip = dp.getAddress().getHostAddress();
                String data = new String(dp.getData());
                System.out.println(ip+ "::"+data);
            }

        }catch (Exception e){
            throw new RuntimeException("接收失败!");
        }
        }
}
public class ChatDemo {
    public static void main(String[] args) throws Exception{
        DatagramSocket sendSocket = new DatagramSocket();
        DatagramSocket receSocket = new DatagramSocket(10002);
        Rece r = new Rece(receSocket);
        Send s = new Send(sendSocket);
        new Thread(r).start();
        new Thread(s).start();
    }
}
