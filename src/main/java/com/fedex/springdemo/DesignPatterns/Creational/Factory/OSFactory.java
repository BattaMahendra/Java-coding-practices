package com.fedex.springdemo.DesignPatterns.Creational.Factory;

public class OSFactory {

	public OS getInstance(String type) {
		if(type=="UI") {
			return new Android();
		}else if(type=="SEC") {
			return new iOs();
		}
		return new Android();
	}
}
