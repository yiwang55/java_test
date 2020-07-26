package com.yiwang.javaLearning;

class ArrayTest6 {

	public static void toBin(int num) {
		char[] chs = {'0','1'};
		char[] arr = new char[32];
		
		int pos = arr.length;
		
		while(num != 0) {
			int temp = num & 1;
			arr[--pos] = chs[temp];
			num = num >>> 1;
		}
		for (int x = pos; x < arr.length; x++) {
			System.out.print(arr[x]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toBin(-6);
	}

}
