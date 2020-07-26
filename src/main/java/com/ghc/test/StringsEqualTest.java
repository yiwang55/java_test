package com.ghc.test;

public class StringsEqualTest {

	 public String Equal(String a , String b) {
		 if(a.equals(b))
			 return "equal";
		 else
			 return "not equal";
	 }
	 
//	 public String foundDup(String a , String b) {
//		String Fd = a.
//		 return Fd;
//	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringsEqualTest e = new StringsEqualTest();
		System.out.println("Equal: " + e.Equal("abc", "abcd"));
//		System.out.println("foundDuplication " + e.foundDuplication("abc", "abcd"));
	}

}
