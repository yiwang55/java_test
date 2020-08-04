package com.ghcTest;

class Body {
	public long idNum;
	public String name = "<unnamed>";
	public Body orbits = null;
	private static long nextID = 0;
	{
		idNum = nextID++;
	}
	public Body(String bodyName, Body orbitsAround) {
		name = bodyName;
		orbits = orbitsAround;
	}
}



























