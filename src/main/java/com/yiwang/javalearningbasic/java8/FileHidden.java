package com.yiwang.javalearningbasic.java8;

import java.io.File;
import java.io.FileFilter;

public class FileHidden {
    public static void main(String[] args) {
        File[] files = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });
    }
}
