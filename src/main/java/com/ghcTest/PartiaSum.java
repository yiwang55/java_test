package com.ghcTest;

public class PartiaSum {
	//print out the Partial Sum for n <=50
//		public static void main(String[] args) {
//			int s = 0;
//			int i = 1;
//			while (i <= 50) {
//				
//				s = s + i * i;
//				
//				i += 1;
//				
//				System.out.println(s);
//			}
////			System.out.println(s);
//		}
	public static void main(String[] args) {
		int s = 0;
		for (int i = 1; i <=50; i++) {
			s = s + i * i;
			System.out.println(s);
		}
	}
}
