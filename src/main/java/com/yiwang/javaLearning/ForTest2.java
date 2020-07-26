package com.yiwang.javaLearning;

class ForTest2 {///
	/////累加思想和计数器思想

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		for(int i=1; i<=100; i++) {
			if (i%7==0) {
//				System.out.println(i);
				a++;
			}
		}
		System.out.println(a);
	}

}
