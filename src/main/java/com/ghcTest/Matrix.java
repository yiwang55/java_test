package com.ghcTest;

public class Matrix {
	
	public static void main(String args) {
		float[][] mat = new float[4][4];
		
		setupMatrix(mat);
		
		for(int x = 0; x < mat.length; x++) {
			for(int y = 0; y < mat[x].length; y++) 
				System.out.print(mat[x][y] + " ");
			System.out.println();
		}
	}

	private static void setupMatrix(float[][] mat) {
		// TODO Auto-generated method stub
		
	}
}
