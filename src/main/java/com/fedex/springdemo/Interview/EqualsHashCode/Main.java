package com.fedex.springdemo.Interview.EqualsHashCode;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"Saurav");
		Employee e2=new Employee(2,"Shruti");
		Employee e3=new Employee(1,"Saurav");
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		if(e1.hashCode()==e3.hashCode()) {
			System.out.println(e1.equals(e3));
		}else {
			System.out.println("Not Equal");
		}
		Set<Employee> st=new HashSet<>();
		st.add(e1);
		st.add(e3);
		System.out.println(st);
		//Will give result of size 2 if hash code and equals method is not implemented.
		//But will  give 1 if hash code and equals method is implemented.
	}

}
