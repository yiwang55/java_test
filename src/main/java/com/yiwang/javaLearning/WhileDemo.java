package com.yiwang.javaLearning;

class WhileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int x = 1;
		while (x<3)
		{
			System.out.println("x = " + x);//无限循环  
			++x;
		}*/
	
		int x =1;
		do
		{
			System.out.println("do: x = " + x);//无限循环  
			x++;
		}
		while(x < 3);
		
	}

}
