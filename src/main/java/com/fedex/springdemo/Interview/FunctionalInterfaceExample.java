package com.fedex.springdemo.Interview;
@FunctionalInterface
interface Fun{
	void run(String name);
}
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Fun obj=(String name)->{
			System.out.println(name+" is Running");
		};
		Fun obj1=(name)->System.out.println(name+" is Running Speedily");
		obj1.run("Saurav");
		obj.run("Shruti");
	}
}
