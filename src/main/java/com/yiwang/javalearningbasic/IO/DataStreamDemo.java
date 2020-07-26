package com.yiwang.javalearningbasic.IO;

import java.io.*;

public class DataStreamDemo {
    public static void main(String[] args) throws IOException {
//        write();
        read();
    }

    private static void read() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));
        byte b = dis.readByte();
        int i = dis.readInt();
        float v = dis.readFloat();
        dis.close();
        System.out.println(b );
        System.out.println(i);
        System.out.println(v);
    }

    private static void write() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));
        dos.writeBytes("hello moto");
        dos.writeInt(1000);
        dos.writeFloat(132.15F);
        dos.flush();
        dos.close();
    }
}
