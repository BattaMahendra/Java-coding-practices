package com.fedex.springdemo.Interview;

class Mobile{
	String os;
	String brand;
	static String name;
	static {
		name="Smartphone";
		System.out.println("Inside static block");
	}
	public void show() {
		System.out.println("OS "+os+" Name "+name);
	}
}
public class StaticVariable {
	public static void main(String args[]) throws ClassNotFoundException {
		System.out.println("Inside Main");
		//Use it only for loading class
		Class.forName("com.fedex.springdemo.Interview.Mobile");
//		Mobile mb1=new Mobile();
//		mb1.os="Android";
//		mb1.brand="Samsung";
//		//Mobile.name="Smartphone1";
//		Mobile mb2=new Mobile();
//		mb2.os="iOS";
//		mb2.brand="Apple";
//		//Mobile.name="Smartphone2";
//		mb1.show();
//		mb2.show();
	}
	
}
