package com.fedex.springdemo.Notes;

public class Example {
	public static void main(String a[]) {
		//All the values we mentioned after equals are called as literals
		byte by=125;
		System.out.println(by);
		int num=0b1101;
		System.out.println(num);
		int num1=10_00_000_000;
		System.out.println(num1);
		char c='a';
		c++;
		System.out.println(c);
		//Type Casting
		byte b=4;
		int a1=b;
		System.out.println(a1);
		int a2=1000;
		byte b2=(byte) a2;
		System.out.println(b2);
		
		//Switch
		int sw=5;
		switch (sw) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Anyday");
		}
		//Do While
		int doWhile=1;
		do {
			System.out.println("Hi "+ doWhile);
			doWhile++;
		}while(doWhile<=5);
		
		//For 
		//If we will remove loop <=5 then it will go for infinite loop
		int loop=1;
		for (;loop <=5; ) {
			System.out.println("Day " +loop);
			loop++;
		}
	}
}
