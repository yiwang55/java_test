package com.yiwang.javaLearning;

class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr = new int[3];
		int [] arr = {3,6,5,1,8,9,67};
//		int sum = 0;
//		
//		for(int i= 0; i < arr.length; i++) {
//		sum += arr[i];
//			//System.out.println(arr[i]);
////			System.out.println(arr.length);
//		}
//		System.out.println(sum);
		printArray(arr);
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

}
