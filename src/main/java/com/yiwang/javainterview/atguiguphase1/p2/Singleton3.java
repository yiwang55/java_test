package com.yiwang.javainterview.atguiguphase1.p2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Singleton3 {
    public static final Singleton3 INSTANCE;
    private String info;

    static {
        Properties properties = new Properties();
        InputStream stream = Singleton3.class.getClassLoader().getResourceAsStream("single.properties");
        try {
            properties.load(stream);
        } catch (IOException e) {
            throw new RuntimeException();
        }
        INSTANCE = new Singleton3(properties.getProperty("info"));
    }

    private Singleton3(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "info='" + info + '\'' +
                '}';
    }
}
