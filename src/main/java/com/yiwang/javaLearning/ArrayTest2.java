package com.yiwang.javaLearning;

class ArrayTest2 {
////////—°‘Ò≈≈–Ú
	public static void selectSort(int[] arr) {
		for(int x = 0; x < arr.length-1; x++) {
			for(int y = x+1; y < arr.length; y++) {
				if(arr[x]>arr[y]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,1,6,4,2,8,9};
		printArray(arr);
		selectSort(arr);
		System.out.println();
		printArray(arr);
		
	}

}
