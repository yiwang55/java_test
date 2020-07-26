package com.yiwang.javaLearning;

/*
 给定一个数组{5,1,6,4,2,8,9}
 1.获取数组中的最大值和最小值。
 * */

class ArrayTest {
	public static int getMax(int[] arry){
		int max = arry[0];
		for(int i = 1; i < arry.length; i++) {
			if (arry[i] > max) {
				max = arry[i];
			}
		}
		return max;
	} 
	
	public static int getMin(int[] arry){
		int min = arry[0];
		for(int i = 1; i < arry.length; i++) {
			if (arry[i] < min) {
				min = arry[i];
			}
		}
		return min;
	}

	public static int getMax_2(int[] arry){
		int max = 0;
		for(int i = 1; i < arry.length; i++) {
			if (arry[i] > arry[max]) {
				max = i;
			}
		}
		return arry[max];
	} 

//	public static double getMax(double[] arry){
//	} 函数重载  功能一样，参数类型不同。
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,1,6,20,4,2,8,9};
		
		int max = getMax_2(arr);
		int min = getMin(arr);
		System.out.println(max);
		System.out.println(min);
	}
}