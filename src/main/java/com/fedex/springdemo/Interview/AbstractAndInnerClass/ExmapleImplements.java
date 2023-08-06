package com.fedex.springdemo.Interview.AbstractAndInnerClass;

class ExampleImplementer implements Example{

	@Override
	public void config() {
	System.out.println("Inside ExampleImplementer config");
	}	
}
public class ExmapleImplements{
	public static void main(String args[]) {
		Example obj=new ExampleImplementer();
		obj.config();
		System.out.println(Example.city);
	}
}
