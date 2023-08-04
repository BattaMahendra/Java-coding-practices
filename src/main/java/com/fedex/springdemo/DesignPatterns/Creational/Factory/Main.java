package com.fedex.springdemo.DesignPatterns.Creational.Factory;

public class Main {
//Hide the design of objects from client
	public static void main(String[] args) {
		OSFactory fact=new OSFactory();
		fact.getInstance("UI").execute();
	}

}
