package com.fedex.springdemo.Interview.AbstractAndInnerClass;

public class Wagnor extends Car {
	public void automateGear() {
		System.out.println("Gear automated");
	}

	@Override
	public void drive() {
		System.out.println("Wagnor Running");
	}
}
