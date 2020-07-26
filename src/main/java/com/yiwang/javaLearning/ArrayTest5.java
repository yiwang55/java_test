package com.yiwang.javaLearning;

public class ArrayTest5 {
    /*
    * 查表法，将所有元素临时存储起来，建立对应关系。
    *
    * */
    public  static  void toHex(int num){
        char[] chs ={
                '0','1','2','3','4','5','6','7'
                ,'8','9','A','B','C','D','E','F'
        };
        char[] arr = new char[8];
        int pos = arr.length;

        // for(int x= 0; x<8; x++) {
        while(num !=0){
            int temp = num & 15;
        //    System.out.println(chs[temp]);
            arr[--pos] = chs[temp];
            num = num >>> 4;
        }
        System.out.println("pos=" + pos);
        for(int x = pos; x<arr.length; x++){
            System.out.println(arr[x]+",");
        }
    }
    public  static void main (String[] args){
    toHex(-60);
    }
}
