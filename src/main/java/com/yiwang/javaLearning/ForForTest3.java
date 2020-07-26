package com.yiwang.javaLearning;

class ForForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x =0; x < 5; x++) {
			for(int y=x+1; y < 5; y++) {
				System.out.print(" ");
			}	
			for(int z = 0; z <= x; z++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
