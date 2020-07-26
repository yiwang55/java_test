package com.yiwang.javalearningbasic.day13String;

/**
 * Created by yiwang on 2018/6/4.
 */
//StringBuffer是字符串缓冲区
/*是一个容器
1,长度是可以变化的
2,可以操作多个数据类型
3,最总会变成toString方法结果

可以进行CURD操作
存储 append() insert()
删除 delete()包头不包尾
获取 charAt() indexOf()
修改 replace() reverse()
 */
public class StringBufferDemo
{
    public static void main(String[] args){
//        method_modify();
        StringBuffer sb = new StringBuffer("abcde");
        char[] chs = new char[4];

        sb.getChars(1,4,chs,1);
        for (int x =0 ;x< chs.length;x++){
            sop("chs[" + x + "]=" + chs[x]+ ";");
        }
    }

    public static void method_modify(){
        StringBuffer sb = new StringBuffer("abcde");
//        sb.replace();
        sb.setCharAt(2 ,'k');

        sop(sb.reverse().toString());
    }

    public static void method_del(){
        StringBuffer sb = new StringBuffer("abcde");
//        sb.delete(1,3);
        sb.deleteCharAt(2);
        sop(sb.toString());
    }

    public static void method_add(){
        StringBuffer sb = new StringBuffer();

        sb.append("abc").append(true).append(34).insert(1,"kk");
//        StringBuffer sb1 = sb.append(34);
//        sop("sb == sb1: " + (sb == sb1));
        sop(sb.toString());
//        sop(sb1.toString());
    }
    public static void sop(String str){
        System.out.println(str);
    }
}
