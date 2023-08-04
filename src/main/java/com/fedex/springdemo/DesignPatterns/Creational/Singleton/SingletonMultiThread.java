package com.fedex.springdemo.DesignPatterns.Creational.Singleton;

public class SingletonMultiThread {
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				Multi obj=Multi.getInstance();
			}
		});
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				Multi obj1=Multi.getInstance();
			}
		});
		t1.start();
		t2.start();
	}

}
class Multi{
	//static ABC obj=new ABC();//Eager Instantiation
	static Multi obj;
	private Multi() {
		System.out.println("Object Created");
	}
	
	//By making method synchronized it will hamper performance
//		synchronized public static Multi getInstance() {
//			//What if two thread come at one time and enters to this block,
//			//without any interval. then in that case they might create two 
//			//separate objects.
//			//Lazy Instantiation
//			if(obj==null) {
//				obj=new Multi();
//			}
//			return obj;
//		}
	
	//Double Check Locking
	
	public static Multi getInstance() {
		//What if two thread come at one time and enters to this block,
		//without any interval. then in that case they might create two 
		//separate objects.
		//Lazy Instantiation
		if(obj==null) {
			synchronized(Multi.class) {
				if(obj==null) {
					obj=new Multi();
				}
			}
		}
		return obj;
	}
}
