package com.yiwang.javalearningbasic.day20IOStream;

import com.yiwang.javalearningbasic.SOP;

import java.io.File;
import java.io.IOException;

/**
 * file类的常见方法
 * 1. 创建
 * boolean createNewFIle() 指定位置创建文件，如果文件存在，则不创建返回false；
 * 2. 删除
 * boolean delete()删除失败返回false。
 * boolean deleteOnExit()程序退出时删除指定文件
 * 3，判断
 * boolean exists():文件是否存在
 * isFile
 * isDirectory
 * 4，获取信息
 * getName()
 * getPath()
 * getParent()
 * getAbsolutePath()
 * lastModified()
 * length()
 * **/
public class FileDemo extends SOP {
    public static void main(String[] args) throws IOException{
        method_5();
    }
    public static void method_5(){
        File f = new File("demo.txt");
        File f2 = new File("buf.txt");
        sop("rename:" + f.renameTo(f2));
    }
    public static void method_4() throws IOException{
        File f = new File("file.txt");
        sop("path:" + f.getPath());
        sop("abspath:" + f.getAbsolutePath());
        sop("parent:" + f.getParent());
    }

    public static void method_3() throws IOException{
        File f= new File("file.txt");
        f.mkdir();
        sop("dri:" + f.isDirectory());
        sop("file:" + f.isFile());
        sop(f.isAbsolute());
//        f.createNewFile();
//        if(!f.exists())
//            sop("file not exists!");

    }
    public static void method_2(){
//        File f = new File("demo.txt");
//        sop("execute:" + f.exists());
        File dir = new File("abc\\kk\\ppp\\oiii\\hugu");
        sop("isDirectory:"+ dir.mkdirs());
    }
    public static void method_1() throws IOException{
        File f = new File("file.txt");
//        sop("create:" + f.createNewFile());
        sop("delete:" + f.delete());

    }

    public static void consMethod(){
        File f1 = new File("a.txt");

        File f2 = new File("D:\\test","b.txt");

        File d = new File("D:\\test");
        File f3 = new File(d,"c.txt");

        sop("f1: " + f1);
        sop("f2: " + f2);
        sop("f3: " + f3);

        File f4 = new File("D:"+File.separator+"test"+File.separator+"a.txt");
        sop("f4: " + f4);
    }
}
