package com.fedex.springdemo.DesignPatterns.Creational.Builder.Functional;

import java.util.function.Consumer;


public class PhoneBuilder {

	protected String os;
	protected Integer ram;
	protected String processor;
	protected double screensize;
	protected Integer battery;
	
	public PhoneBuilder with(Consumer<PhoneBuilder> buildWithFileds) {
		
		buildWithFileds.accept(this);
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(this);
	}

}
