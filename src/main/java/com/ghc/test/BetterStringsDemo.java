package com.ghc.test;

public class BetterStringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName = "Petronius";
		String occupation = "Reorganization Specialist ";
		myName = myName + " Arbiter ";
		myName += " ";
		myName += "( " + occupation + " )";
		System.out.println("Name = " + myName);
	}

}
