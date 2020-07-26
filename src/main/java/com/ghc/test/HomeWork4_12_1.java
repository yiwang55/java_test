package com.ghc.test;

public class HomeWork4_12_1 {
	public static void main(String[] args) {
	int w = 0;
	outer:
		for(int x = 0; x < 5; x++) {
			for (int y = 0; y < 100; y++) {
				if (x ==3)
					break outer;
				w++;
			}
			
		}
	System.out.println("w = " + w);
	}
}