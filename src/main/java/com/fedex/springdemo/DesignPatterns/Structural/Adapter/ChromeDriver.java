package com.fedex.springdemo.DesignPatterns.Structural.Adapter;

public class ChromeDriver implements WebDriver{

	@Override
	public void getElement() {
		System.out.println("Getting chrome element");		
	}

	@Override
	public void selectElement() {
		System.out.println("Selecting chrome element");
	}
}
