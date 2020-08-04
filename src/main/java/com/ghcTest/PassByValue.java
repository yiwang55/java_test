package com.ghcTest;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double one = 1.0;
		System.out.println("before:one = " + one);
		halveIt(one);
		System.out.println("after:one = " + one);
	}

	public static void halveIt(double arg) {
		arg /=2.0;
		System.out.println("halved:arg = " + arg);
	}
}
