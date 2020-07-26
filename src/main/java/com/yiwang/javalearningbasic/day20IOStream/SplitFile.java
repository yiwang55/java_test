package com.yiwang.javalearningbasic.day20IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class SplitFile {
    public static void main(String[] args) throws IOException{
        mergeFile();
    }

    public static void mergeFile() throws IOException{
        ArrayList<FileInputStream> al =new ArrayList<FileInputStream>();
        for(int x = 1; x<3;x++){
            al.add(new FileInputStream((x)+"split.part"));
        }
        Iterator<FileInputStream> it = al.iterator();
        Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {
            @Override
            public boolean hasMoreElements() {
                return it.hasNext();
            }
            @Override
            public FileInputStream nextElement() {
                return it.next();
            }
        };

        SequenceInputStream sis = new SequenceInputStream(en);
        FileOutputStream fos = new FileOutputStream("0.txt");

        byte[] buf = new byte[1024];
        int len = 0;
        while((len=sis.read(buf))!=-1){
            fos.write(buf,0,len);
        }
        fos.close();
        sis.close();
    }

    public static void splitFile() throws IOException{
        FileInputStream fis = new FileInputStream("sysinfo.txt");
        FileOutputStream fos = null;

        byte[] buf = new byte[1024];

        int len = 0;
        int count =1;
        while((len= fis.read(buf))!= -1){
            fos = new FileOutputStream((count++)+"split.part");
            fos.write(buf,0,len);
        }
        fos.close();
    }
}
