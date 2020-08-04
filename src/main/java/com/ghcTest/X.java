package com.ghcTest;

public class X {
	protected int xMask = 0x00ff;
	protected int fullMask;
	
	public X() {
		fullMask = xMask;
	}
	public int mask(int orig) {
		return (orig & fullMask);
	}
	
}

class Y extends X{
	protected int yMask = 0xff00;
	
	public Y () {
		fullMask |=yMask;
	}
}
