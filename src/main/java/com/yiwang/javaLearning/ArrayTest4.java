package com.yiwang.javaLearning;

public class ArrayTest4 {
//十进制 --》 二进制
    public static void toBin(int num){
        StringBuffer sb = new StringBuffer();
        while(num > 0 ){
            sb.append(num % 2);
            num = num / 2;
        }
        System.out.println(sb.reverse());
    }

    /////十进制 --》 十六进制
    public static void toHex(int num){
     StringBuffer sb= new StringBuffer();
        for(int x = 0; x < 8; x++){
            int temp = num & 15;
            if(temp>9)
sb.append((char)(temp-10+'A'));
                //                System.out.println((char)(temp-10+'A'));
            else
                sb.append(temp);

            num = num >>>4;
        }
        System.out.println(sb.reverse());
    }
 public static void main(String[] args){
        toHex(60);
 }


}
