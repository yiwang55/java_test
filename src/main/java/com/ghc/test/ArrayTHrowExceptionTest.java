package com.ghc.test;

public class ArrayTHrowExceptionTest {
	static double average(int[] values) {
		
		
//		if(values == null)
//			throw new IndexOutOfBoundsException();
//		else
//			if (values.length == 0)
//				throw new IndexOutOfBoundsException();
		
		if (values == null || values.length == 0)
			throw new IndexOutOfBoundsException();		
			else {
				double sum = 0.0;
				
//				for(int i = 0; i < values.length; i++) {
//					sum = sum + values[i];
//				};
				for(int v : values) { //逐元循环
					sum += v;
				}				
				
			return sum / values.length;	
			}
	}
	
	public static void main(String[] args) {
		int[] data = {11,22,33,44};
//		int[] data = {1};
		System.out.println(average(data));
	}
}
