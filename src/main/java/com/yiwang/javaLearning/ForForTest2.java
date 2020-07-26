package com.yiwang.javaLearning;

class ForForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x = 1; x <=9 ; x++){
			for(int y = 1; y <= x; y++) {
				System.out.print(y + "*" +x+ "=" +x*y+ "\t");
			}
			System.out.println();
		}
	}
}
