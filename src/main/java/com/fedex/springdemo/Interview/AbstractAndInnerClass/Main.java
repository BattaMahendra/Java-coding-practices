package com.fedex.springdemo.Interview.AbstractAndInnerClass;

public class Main {

	public static void main(String[] args) {
		//Car car=new Car();
		//can't instantiate Car since it is a abstract class
		Car ca=new Wagnor();
		ca.drive();
	}

}
