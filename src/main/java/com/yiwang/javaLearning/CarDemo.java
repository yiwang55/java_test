package com.yiwang.javaLearning;

class Car{
	String color = "red";
	int num = 4;
	void run(){
		System.out.println(color +".."+num);
	}

}
class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car c = new Car();
//		c.num = 5;
//		Car c1 = c;
//		c1.color = "blue";
//			c.run();

		//
//		new Car().num = 5;
//		new Car().color="blue";
//		new Car().run();
	show(new Car());//匿名對象可作為實際參數傳遞
	}
	public static void show(Car c){
		c.num = 3;
		c.color = "black";
		c.run();
	}

}
