package com.ghcTest;

public class CharCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = '\uffff';
		short s = (short)'\uffff';
		System.out.println("i = " + i);
		System.out.println("s = " + s);
		
		int j = 3;
		System.out.println("j = " + (j++ + j++ + --j));
	}

}
