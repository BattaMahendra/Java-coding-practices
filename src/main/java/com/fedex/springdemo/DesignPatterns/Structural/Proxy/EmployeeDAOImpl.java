package com.fedex.springdemo.DesignPatterns.Structural.Proxy;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void create(String client, Employee obj) throws Exception {
		System.out.println("Creating Employee");
	}

	@Override
	public void delete(String client, String empId) throws Exception {
		System.out.println("Deleting Employee");
	}

	@Override
	public Employee get(String client, String empId) throws Exception {
		System.out.println("Getting Employee");
		return new Employee();
	}

}
