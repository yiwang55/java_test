package com.yiwang.javalearningbasic.IO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        read();
    }

    private static void read()throws IOException {
        RandomAccessFile raf = new RandomAccessFile("RandomAccessFile.txt","rw");
        int i = raf.readInt();
        System.out.println(i);
    }
    private static void write()throws IOException {
        RandomAccessFile raf = new RandomAccessFile("RandomAccessFile.txt","rw");
        raf.writeInt(66);
        raf.close();
    }
}
