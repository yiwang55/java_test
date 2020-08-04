package com.ghcTest;

import java.awt.Color;

class Pixel extends Point{
	public Pixel(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	Color color;
	
	public void clear() {
		super.clear();
		color = null; 
	}
	
}
