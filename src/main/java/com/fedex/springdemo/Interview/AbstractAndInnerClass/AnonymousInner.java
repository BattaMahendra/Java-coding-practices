package com.fedex.springdemo.Interview.AbstractAndInnerClass;

class ABC{
	public void show() {
		System.out.println("Inside A");
	}
}
public class AnonymousInner {

	public static void main(String[] args) {

		ABC an=new ABC() {
			public void show() {
				System.out.println("Inside Inner class");
			}
		};
		an.show();
		ABC and=new ABC();
		and.show();
	}

}
