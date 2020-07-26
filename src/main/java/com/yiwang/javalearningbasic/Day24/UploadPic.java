package com.yiwang.javalearningbasic.Day24;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class PicClient{
    public static void main(String[] args) throws IOException{
        if(args.length!=1){
            System.out.println("请选择一个png格式的图片");
            return;
        }

        File file = new File(args[0]);
        if(!(file.exists() && file.isFile())){
            System.out.println("文件有问题，不存在或者不是文件");
            return;
        }
        if(!file.getName().endsWith(".png")){
            System.out.println("图片格式错误，请重新选择");
            return;
        }
        if(file.length()>1024*1024*5){
            System.out.println("图片太大，请重新选择");
            return;
        }

        Socket s = new Socket("192.168.0.143",10006);
        FileInputStream fis = new FileInputStream(file);
        OutputStream out = s.getOutputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while((len = fis.read(buf)) != -1){
            out.write(buf,0,len);
        }

        s.shutdownOutput();

        InputStream in = s.getInputStream();
        byte[] bufIn = new byte[1024];
        int num = in.read(bufIn);
        System.out.println(new String(bufIn,0,num));

        fis.close();
        s.close();
    }
}
class PicServer{
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(10006);
        while(true){
            Socket s = ss.accept();
            new Thread(new PicThread(s)).start();
        }

    }
}
class PicThread implements Runnable{
    private Socket s;
    PicThread(Socket s){
        this.s = s;
    }

    @Override
    public void run() {
        try{
            String ip = s.getInetAddress().getHostAddress();
            System.out.println(ip+ "............connected");
            int count = 1;
            InputStream in = s.getInputStream();

            File file = new File(ip+"("+count+")"+".png");
            while(file.exists()){
                file = new File(ip+"("+(count++)+")"+".png");
            }
            FileOutputStream fos = new FileOutputStream(file);
            byte[] buf = new byte[1024];
            int len = 0;
            while((len = in.read(buf))!= -1){
                fos.write(buf,0,len);
            }
            OutputStream out = s.getOutputStream();
            out.write("上传成功".getBytes());

            fos.close();
            s.close();
        }catch (Exception e){
            throw new RuntimeException("上传失败");
        }
    }
}
public class UploadPic {
    public static void main(String[] args){

    }
}
