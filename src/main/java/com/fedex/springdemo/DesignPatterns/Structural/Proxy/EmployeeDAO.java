package com.fedex.springdemo.DesignPatterns.Structural.Proxy;

public interface EmployeeDAO {
	
	public void create(String client,Employee obj)throws Exception;
	public void delete(String client,String empId)throws Exception;
	public Employee get(String client,String empId)throws Exception;

}
