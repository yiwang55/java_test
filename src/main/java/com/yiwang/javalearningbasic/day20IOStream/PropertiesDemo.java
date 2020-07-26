package com.yiwang.javalearningbasic.day20IOStream;

import com.yiwang.javalearningbasic.SOP;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo extends SOP {
    public static void main(String[] args) throws IOException{
        loadDemo();
//        Properties prop  = new Properties();
//        System.out.println(prop);
    }
    public static void loadDemo() throws IOException{
        FileInputStream fis = new FileInputStream("info.txt");
        Properties prop = new Properties();
        prop.load(fis);
        sop(prop);
        prop.setProperty("ww","99");
        FileOutputStream fos = new FileOutputStream("info.txt");
        prop.store(fos,"new info.txt");
        //        sop(prop);
    }
    public static void method_1() throws IOException{
        BufferedReader bufr= new BufferedReader(new FileReader("info.txt"));
        String line =null;
        Properties prop = new Properties();

        while((line = bufr.readLine())!=null){
//            sop(line);
//            String key = null;
//            String value= null;
            String[] s = line.split("=");
            prop.setProperty(s[0],s[1]);
//            key =s[0];
//            value = s[1];
//            sop(s[0]+"....."+s[1]);

        }
        sop(prop);
//        Set<String> set=prop.stringPropertyNames();
//        Iterator<String> it = set.iterator();
//        while(it.hasNext()){
//            sop(it.next());
//        }
        bufr.close();
    }
    public static void setAndGet(){
        Properties prop  = new Properties();
        prop.setProperty("lisi","20");
        prop.setProperty("zs","34");
        System.out.println(prop);

        String value = prop.getProperty("zs");
        sop(value);
        Set<String> names = prop.stringPropertyNames();
        for(String name : names){
            sop(name+"...."+prop.getProperty(name));
        }
    }
}
