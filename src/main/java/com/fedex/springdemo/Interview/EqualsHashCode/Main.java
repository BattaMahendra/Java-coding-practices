package com.fedex.springdemo.Interview.EqualsHashCode;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"Saurav");
		Employee e2=new Employee(2,"Shruti");
		Employee e3=new Employee(1,"Sumant");
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		if(e1.hashCode()==e3.hashCode()) {
			System.out.println(e1.equals(e3));
		}else {
			System.out.println("Not Equal");
		}
	}

}
