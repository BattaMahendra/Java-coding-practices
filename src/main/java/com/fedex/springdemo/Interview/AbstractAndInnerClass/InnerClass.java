package com.fedex.springdemo.Interview.AbstractAndInnerClass;

class A{
	int age=10;
	public void show() {
		System.out.println("In show");
	}
	 static class B{
		public void config(){
			//System.out.println("In Config "+age);
			System.out.println("In Config");
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
	A aObj=new A();
	aObj.show();
	aObj.age=50;
	
	//A.B obj=aObj.new B(); - If inner class is non-static
	A.B obj=new A.B();
	obj.config();
	}
}
