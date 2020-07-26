package com.yiwang.javalearningbasic.day21IOStream;

import java.io.*;

//可以用于操作基本数据类型的数据流对象
public class DataStreamDemo{
    public static void main(String[] args) throws IOException{
//        writeData();
//        readData();
//        writeUTFDemo();
        readUTFDemo();
    }
    public static void readUTFDemo() throws IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("uftdata.txt"));
        String s = dis.readUTF();
        String s1 = dis.readUTF();
        System.out.println(s);
        System.out.println(s1);
        dis.close();
    }
    public static void writeUTFDemo() throws IOException{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("uftdata.txt"));
        dos.writeUTF("你还");
        dos.writeUTF("haha");
        dos.close();
    }
    public static void readData() throws IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
        int num = dis.readInt();
        boolean b= dis.readBoolean();
        double d = dis.readDouble();

        System.out.println(num);
        System.out.println(b);
        System.out.println(d);
        dis.close();
    }
    public static void writeData() throws IOException{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));

        dos.writeInt(234);
        dos.writeBoolean(true);
        dos.writeDouble(12.1314);

        dos.close();
    }
}
