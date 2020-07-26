package com.tool;

import java.io.File;

public class DeleteMP3FileTool {
    public static void main(String[] args) {
        String inputPath="E:\\";
        File file = new File(inputPath);
        deleteFile(file);
    }

    private static void deleteFile(File file) {
        if (file.isDirectory()){
            File[] files = file.listFiles();
            if (files != null && files.length > 0){
                for (File file1: files
                ) {
                    deleteFile(file1);
                }
            }
        }else{
            if (!file.getName().endsWith(".flac")){
                file.delete();
                System.out.println(file.getName() + " deleted!");
            }
        }
    }
}
