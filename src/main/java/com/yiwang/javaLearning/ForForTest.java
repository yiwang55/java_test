package com.yiwang.javaLearning;

class ForForTest {
	public static void main(String[] args) {
		for(int x = 0; x < 5; x++){
			for(int y = 0; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int x = 0; x < 5; x++){
			for(int y = 0; y <= x; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
	}
}