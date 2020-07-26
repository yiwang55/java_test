package com.yiwang.javalearningbasic.day16Map;

import java.util.*;

/***
 * map扩展知识
 * **/

class Student1{
    private String id;
    private String name;
    Student1(String id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ">>>>>"+ name;
    }
}
public class MapDemo3 {
    public static void main(String[] args){
//        HashMap<String,String> yure = new HashMap<String,String>();
//        HashMap<String,String> jiuye = new HashMap<String,String>();
        List<Student1> yure = new ArrayList<Student1>();
        List<Student1> jiuye = new ArrayList<Student1>();

        yure.add(new Student1("01","zhangsan"));
        yure.add(new Student1("02","lisi"));

        jiuye.add(new Student1("01","zhaoliu"));
        jiuye.add(new Student1("02","wangwu"));

        HashMap<String,List<Student1>> czbk = new HashMap<String,List<Student1>>();
        czbk.put("yure",yure);
        czbk.put("jiuye",jiuye);
//        yure.put("01","zhangsan");
//        yure.put("02","lisi");
//
//        jiuye.put("01","zhaoliu");
//        jiuye.put("02","wangwu");

        Iterator<String> it = czbk.keySet().iterator();
        while (it.hasNext()){
            String roomName = it.next();
            List<Student1> list = czbk.get(roomName);
            System.out.println(roomName);
            getStuinfo(list);
        }

//        getStudentInfo(yure);
    }
    public static void getStuinfo(List<Student1> list){
        Iterator<Student1> it = list.iterator();
        while(it.hasNext()){
            Student1 s = it.next();
            System.out.println(s.toString());
        }
    }
     public static void getStudentInfo(HashMap<String,String> roomMap) {
         Iterator<String> it = roomMap.keySet().iterator();

         while(it.hasNext()){
             String id = it.next();
             String room = roomMap.get(id);
             System.out.println("id = "+ id +">>>"+"room = "+ room);
         }
     }
}
