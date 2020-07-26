package com.yiwang.javaLearning;

class SwitchDemo {

	/////switch适用情况，数值确定且数量较少 否则 用if else
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		
		switch(x)
		{
		case 4:
			System.out.println("a");
		case 6:
			System.out.println("b");
		case 2:
			System.out.println("c");
		default:
			System.out.println("d");
		}
	}

}
