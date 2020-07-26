package com.yiwang.javalearningbasic.day20IOStream;

import com.yiwang.javalearningbasic.SOP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class RunCount extends SOP {
    public static void main(String[] args) throws IOException{
        Properties prop = new Properties();
        File file = new File("count.ini");
        if (!file.exists())
            file.createNewFile();
        FileInputStream fis = new FileInputStream(file);

        prop.load(fis);
        int count = 0;
        String value  = prop.getProperty("time");
        if(value!= null) {
            count = Integer.parseInt(value);
        }
            if(count>=5){
                sop("您好，使用次数已满");
                return;
            }
            count++;
            prop.setProperty("time",count+"");
            FileOutputStream fos = new FileOutputStream("count.ini");
            prop.store(fos,"new count");

            fis.close();
            fos.close();
    }
}
