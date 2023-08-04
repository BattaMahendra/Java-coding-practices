package com.fedex.springdemo.DesignPatterns.Structural.Adapter;

public class Main {

	public static void main(String[] args) {
		ChromeDriver cm=new ChromeDriver();
		cm.getElement();
		cm.selectElement();
		
		IEDriver ie=new IEDriver();
//		ie.findElement();
//		ie.clickElement();
		
		WebDriverAdapter webDrivAdap=new WebDriverAdapter(ie);
		webDrivAdap.getElement();
		webDrivAdap.selectElement();
	}

}
