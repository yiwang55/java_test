/**
 * 
 */
package com.ghc.test;

/**
 * @author yi.wang
 *
 */
class Color {
	int red, green, blue;
	Color(){}
	Color(int red, int green, int blue){
		this.blue = blue;
		this.green = green;
		this.red = red;
	}
	
	public String toString() {
		return "Red = " + red + "; Green = " +green+ ";Blue = " + blue;
	}
}
