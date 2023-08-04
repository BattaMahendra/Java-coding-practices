package com.fedex.springdemo.DesignPatterns.Creational.Singleton;


public class SingletonEnum {
	public static void main(String[] args) {
		Employee obj=Employee.INSTANCE;
		obj.i=5;
		obj.show();
		Employee obj1=Employee.INSTANCE;
		obj1.i=6;
		obj1.show();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}

}
enum Employee{//Special type of class. It will have a private constructor already.
	INSTANCE;
	int i;
	public void show() {
		System.out.println(i);
	}
}
