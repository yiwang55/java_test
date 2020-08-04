package com.ghcTest;

public class Bodyprint {
	public static void main(String[] args) {
		Body sun = new Body("Sol",null);
		Body earth = new Body("Earth",sun);
		
		System.out.println("Body " + earth.name + " orbits " + 
		earth.orbits.name + " and has ID" + earth.idNum);
		System.out.println("Body " + sun.toString());
		System.out.println("Body " + earth);
	}
}
