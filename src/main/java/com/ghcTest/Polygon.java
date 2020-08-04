package com.ghcTest;

class Polygon {
	
	private Point[] vertices;
	
	public Polygon(Point... vers) {
		vertices = new Point[vers.length];
		for (int i = 0; i < vertices.length; i++ ) {
			vertices[i] = vers[i];
		}
	}
	
	public void print() {
		for(Point p : vertices)
			System.out.println(p);
	}
	
	public int getEdgeNum(){
		return vertices.length;
	}
	
	public static void main(String[] args) {
		Polygon triange = new Polygon(new Point(11,22),new Point(22,33), new Point(33,22));
		System.out.println(triange.getEdgeNum());
		triange.print();
	}
}
