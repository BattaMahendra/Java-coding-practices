package com.fedex.springdemo.DesignPatterns.Structural.Proxy;

public class Main {
	public static void main(String a[]) {
		EmployeeDAO obj=new EmployeeDAOProxy();
		try {
			obj.create("ADMIN", new Employee());
			obj.create("USER", new Employee());
			obj.get("BUSINESS", "75211");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
