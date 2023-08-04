package com.fedex.springdemo.DesignPatterns.Creational.Singleton;

public class Signleton {

	public static void main(String[] args) {
		ABC obj=ABC.getInstance();
		ABC obj1=ABC.getInstance();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}

}
class ABC{
	//static ABC obj=new ABC();//Eager Instantiation
	static ABC obj;
	private ABC() {
		
	}
	public static ABC getInstance() {
		//Lazy Instantiation
		if(obj==null) {
			obj=new ABC();
		}
		return obj;
	}
}
