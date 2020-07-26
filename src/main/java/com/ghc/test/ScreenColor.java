package com.ghc.test;

public class ScreenColor {
	private int red = 0;
	
	private int green = 0;
	
	private int blue = 0;
	
	public ScreenColor() {}
	
	public ScreenColor(int red, int green, int blue) {
		this.blue = blue;
		this.red = red;
		this.green = green;
	}
	
	public ScreenColor(String color) {
		if(color.equals("transparent"))
			red = green = blue = 0;
		else if (color.equals("red"))
			red = 255;
		else if (color.equals("green"))
			green = 255;
		else if (color.equals("blue"))
			blue = 255;
	}
	public String toString() {
		if(red == 0 && green == 0 && blue == 0)
			return "transparent";
		if(red == 255 && green == 0 && blue == 0)
			return "red";
		if(red == 0 && green == 255 && blue == 0)
			return "green";
		if(red == 0 && green == 0 && blue == 255)
			return "blue";
		else
			return null;
		
	}
}
