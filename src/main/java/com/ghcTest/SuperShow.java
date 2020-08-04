package com.ghcTest;

public class SuperShow {

	public String str = "SuperStr";
	public void show() {
		System.out.println(" Super.show: " + str);
	}
}
class ExtendShow extends SuperShow{
	public String str = "ExtendStr";
	
	public void show() {
		System.out.println(" Extend.show: " + str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendShow ext = new ExtendShow();
		SuperShow sup = ext;
		sup.show();
		ext.show();
		System.out.println("sup.str = " + sup.str);
		System.out.println("ext.str = " + ext.str);
	}
	}
