package com.fedex.springdemo.Interview.AbstractAndInnerClass;
interface P{
	public void run();
}
interface Q extends P{
	public void config();
}
class InterfaceExample implements P,Q {

	@Override
	public void config() {
		System.out.println("Config from Q");
	}

	@Override
	public void run() {
		System.out.println("Config from P");
	}

}
public class InterfaceExampleRunner{
	public static void main(String[] args) {
		Q obj=new InterfaceExample();
		obj.config();
		obj.run();
		P obj1=new InterfaceExample();
		obj1.run();
		//P type object has only reference to run method , not to config method.
	}
}
