package com.ghcTest;

public class ImprovedPartialSum {
	private static final int MAX_INDEX = 10;
	
	public static void main(String [] args) {
		int s = 0;
		String mark;
		
		for(int i = 0; i <= MAX_INDEX; i++ ) {
			s = s + i * i;
			if(s % 2 == 0)
				mark = "*";
			else
				mark = "";
			System.out.println(i + ":" + s + mark);
		}
	}
}
