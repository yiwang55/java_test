package com.yiwang.javalearningbasic.day21IOStream;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException{
//        writeFile();
        writeFile_2();
    }

    public static void readFile()throws IOException{
        RandomAccessFile raf = new RandomAccessFile("ran.txt","r");
//        String s = null;
//        while((s = raf.readLine())!=null)
//            System.out.println(s);
        //调整对象中的指针
//        raf.seek(8);

        raf.skipBytes(8);
        byte[] buf = new byte[4];
        raf.read(buf);
        String name = new String(buf);
        int age = raf.readInt();
        System.out.println("name= "+ name);
        System.out.println("age= "+age);
            raf.close();
    }
    public static void writeFile() throws IOException{
        RandomAccessFile raf = new RandomAccessFile("ran.txt","rw");
        raf.write("lisi".getBytes());
        raf.writeInt(258);
        raf.write("wangwu".getBytes());
        raf.writeInt(99);
        raf.close();
    }
    public static void writeFile_2() throws IOException{
        RandomAccessFile raf = new RandomAccessFile("ran.txt","rw");
        raf.seek(8*3);
        raf.write("zhouqi".getBytes());
        raf.writeInt(103);
        raf.close();
    }
}
