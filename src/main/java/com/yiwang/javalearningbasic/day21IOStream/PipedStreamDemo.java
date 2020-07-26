package com.yiwang.javalearningbasic.day21IOStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Read implements Runnable{
    private PipedInputStream in;
    Read(PipedInputStream i){
        this.in = i;
    }
    public void run(){
        try{        byte[] buf = new byte[1024];
            int len = in.read(buf);
            String s = new String(buf,0,len);
            System.out.println(s);
            in.close();
        }catch (IOException e ){
                throw new RuntimeException("管道流读取失败");
        }

    }
        }
class Writer implements Runnable{
    private PipedOutputStream out;
    Writer(PipedOutputStream o){
        this.out = o;
    }

    @Override
    public void run() {
        try{
            out.write("piped lai le".getBytes());
            out.close();
        }catch (IOException e){
            throw new RuntimeException("管道流读取失败");
        }

    }
}
public class PipedStreamDemo {
    public static void main(String[] args){
        PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream();
        Read r= new Read(in);
        Writer w = new Writer(out);

        new Thread(w).start();
        new Thread(r).start();
    }
}
