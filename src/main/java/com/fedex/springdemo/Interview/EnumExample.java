package com.fedex.springdemo.Interview;


enum Laptop{
	MACBOOKAIR(50000,"iOs"),DELL(30000,"XP"),LENOVO(20000,"Windows"),HP;
	Laptop(int price, String OS) {
		this.price=price;
		this.OS=OS;
	}
	Laptop() {
		price=35000;
		OS="Windows10";
	}
	int price;
	String OS;
}
public class EnumExample {
	public static void main(String args[]) {
		for (Laptop lap : Laptop.values()) {
			System.out.println(lap.OS+ "  "+lap.price);
		}
	}
}
