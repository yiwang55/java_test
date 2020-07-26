package com.yiwang.javalearningbasic.Day24;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

class LoginClient{
    public static void main(String[] args) throws IOException{
        Socket s = new Socket(InetAddress.getByName("localhost"),10008);
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter out = new PrintWriter(s.getOutputStream(),true);

        BufferedReader bufIn=  new BufferedReader(new InputStreamReader(s.getInputStream()));

        for(int x= 0;x<3;x++){
            String line = bufr.readLine();
            if(line == null)
                break;
            out.println(line);

            String info = bufIn.readLine();
            System.out.println("info:"+info);
            if (info.contains("欢迎"))
                break;

        }
        bufr.close();
        s.close();
    }
}
class UserThread implements Runnable{
    private Socket s;
    UserThread(Socket s
    ){
        this.s = s;
    }
    @Override
    public void run() {
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+"..........connected");
        try{
            for(int x =0;x<3;x++){
                BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String name = bufIn.readLine();
                BufferedReader bufr = new BufferedReader(new FileReader("user.txt"));
                PrintWriter out= new PrintWriter(s.getOutputStream());
                String line= null;
                boolean flag = false;
                while((line=bufr.readLine())!=null){
                    if (line.equals(name)){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    System.out.println(name+"已登录");
                    out.println(name+"欢迎光临");
                    break;
                }else{
                    System.out.println(name+"尝试登录");
                    out.println(name+"用户名不存在");
                    break;
                }
            }
        }catch (Exception e){
            throw new RuntimeException(ip+"校验失败");
        }
    }
}
class LoginServer{
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(10008);
        while(true){
            Socket s = ss.accept();
            new Thread(new UserThread(s)).start();
        }

    }
}
public class UserLogin {
}
