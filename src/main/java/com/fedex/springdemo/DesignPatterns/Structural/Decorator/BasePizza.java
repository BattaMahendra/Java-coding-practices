package com.fedex.springdemo.DesignPatterns.Structural.Decorator;

public class BasePizza implements Pizza{
	@Override
	public String bake() {
		return "Base Pizza";
	}

}
