package com.ghc.test;

public class Point {
	public double x,y;
	
	public Point(double x, double y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
//	Point lowerLeft = new Point(0.0, 0.0);
//	Point upperRight = new Point(1280.0, 1024.0);
//	Point middlePoint = new Point(640.0, 512.0);
	
	public void clear() {
		x = 0;
		y = 0;
	}
	
//	public double distance(Point that) {
//		double xdiff,ydiff;
//		xdiff = x - that.x;
//		ydiff = y - that.y;
//		return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
//	}
//	
//	double d = lowerLeft.distance(upperRight);
	
	public double distance(Point p1, Point p2) {
		double xdiff,ydiff;
		xdiff = p1.x - p2.x;
		ydiff = p1.y - p2.y;
		return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
	}
	
//	double d = distance(lowerLeft, upperRight);
	
	public String toString() {
		return "x = " + x + ",y = "+y;
	}
	
	public static void main(String [] args) {
		System.out.println();
	}
}
