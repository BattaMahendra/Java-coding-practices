package com.fedex.springdemo.Interview;


//Accessing both default and parameterized constructor of child class
class A{
	int a;
	public A() {
		System.out.println("Inside Default A");
	}
	public A(int a) {
		System.out.println("Inside parameterized A");
	}
}
class B extends A{
	int b;
	public B() {
		System.out.println("Inside Default B");
	}
	public B(int b) {
		this();
		System.out.println("Inside parameterized B");
	}
}
public class ThisSuper {

	public static void main(String[] args) {
		B be=new B(5);
	}

}
