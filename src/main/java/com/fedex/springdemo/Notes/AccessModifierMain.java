package com.fedex.springdemo.Notes;

import com.fedex.springdemo.Interview.AccessModifier.Employee;

class EmployeeSub extends Employee{
	public int employeeId() {
		return id;
	}
}

public class AccessModifierMain{

	public static void main(String[] args) {
		//Not accessible since its default. 
		//Default is accessible only inside same package
		//System.out.println(new Employee().age);
		
		//Protected variables are accessible in other packages but through inheritance
		System.out.println(new EmployeeSub().employeeId());
	}

}
