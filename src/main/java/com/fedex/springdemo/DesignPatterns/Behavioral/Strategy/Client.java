package com.fedex.springdemo.DesignPatterns.Behavioral.Strategy;

public class Client {

	//Real world example
	//Collections.sort(List list,Comparator c);
	public static void main(String[] args) {
		Context con=new Context();
		con.setCompressionStrategy(new CompressToRar());
		con.generateFile("Abc.text");
		con.setCompressionStrategy(new CompressToZip());
		con.generateFile("75211.jpeg");
	}

}
