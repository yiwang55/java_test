package com.yiwang.javaLearning;
import java.util.*;

public class ArrayTest3 {
    ///////冒泡排序
    public static void bubbleSort(int[] arr){
        for(int x = 0; x < arr.length-1; x++){
             for(int y = 0; y< arr.length-x-1; y++){
                if(arr[y] > arr[y+1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y+1] = temp;
                }
             }
        }
    }

    public static void printArray(int[] arry) {
        System.out.print("[");
        for(int i =0; i < arry.length; i++) {
            if(i != arry.length-1) {
                System.out.print(arry[i] + ", ");
            }
            else
                System.out.print(arry[i] + "]");
        }
    }
  public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] =  arr[b];
        arr[b] = temp;
  }
    public static  void main(String[] args){
        int[] arr = {5,1,6,4,2,8,9};
//        printArray(arr);
//        bubbleSort(arr);
        Arrays.sort(arr);
        System.out.println();
        printArray(arr);


    }

}
