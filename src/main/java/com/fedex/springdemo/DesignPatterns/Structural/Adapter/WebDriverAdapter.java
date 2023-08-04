package com.fedex.springdemo.DesignPatterns.Structural.Adapter;

public class WebDriverAdapter implements WebDriver {
	
	private IEDriver ie;
	
	public WebDriverAdapter(IEDriver ie) {
		this.ie=ie;
	}
	@Override
	public void getElement() {
		this.ie.findElement(); 
	}

	@Override
	public void selectElement() {
		this.ie.clickElement(); 
	}

}
