package com.fedex.springdemo.Interview.Solid.Principle;

class Marker{
	int price;
	String name;
	String color;
	public Marker(int price, String name, String color) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
	}
	
}
class Invoice{
	private Marker marker;
	private int quantity;
	
	public Invoice(Marker marker, int quantity) {
		this.marker = marker;
		this.quantity = quantity;
	}
	public int calculateTotal() {
		int price=(marker.price)*this.quantity;
		return price;
	}
}

//Invoice class is getting changed for Multiple reasons

//Instead split into Multiple classes to have single reason to change like below

class InvoiceDAO{
	private Invoice invoice;

	public InvoiceDAO(Invoice invoice) {
		this.invoice = invoice;
	}
	public void saveToDb() {
		
	}
}

class InvoicePrinter{
	private Invoice invoice;

	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}
	public void printInvoice() {
		
	}
}

public class Solid {
	
}

