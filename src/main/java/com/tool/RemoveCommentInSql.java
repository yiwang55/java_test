package com.tool;

import java.io.*;

public class RemoveCommentInSql {

    public static void main(String[] args) throws Exception {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\DB\\mysqlToPostgresql\\aboard_sqldump.mysql")));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\DB\\mysqlToPostgresql\\aboard_sqldump.sql")));

        String line = null;
        while((line =bufr.readLine()) != null){
            if(line.contains("COMMENT")){
                line = line.substring(0,line.indexOf("COMMENT"))+",";
            }
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }
        bufr.close();
        bufw.close();
    }
}
