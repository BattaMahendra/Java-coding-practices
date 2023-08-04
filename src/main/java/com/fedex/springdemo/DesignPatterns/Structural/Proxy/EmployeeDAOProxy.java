package com.fedex.springdemo.DesignPatterns.Structural.Proxy;

public class EmployeeDAOProxy implements EmployeeDAO {
	
	EmployeeDAO employeeDAO;
	
	public EmployeeDAOProxy() {
		employeeDAO=new EmployeeDAOImpl();
	}
	
	@Override
	public void create(String client, Employee obj) throws Exception {
		if(client=="ADMIN") {
			employeeDAO.create(client, obj);
		}else {
			throw new Exception("Access Denied");
		}
	}

	@Override
	public void delete(String client, String empId) throws Exception {
		if(client=="ADMIN") {
			employeeDAO.delete(client, empId);
		}else {
			throw new Exception("Access Denied");
		}
	}

	@Override
	public Employee get(String client, String empId) throws Exception {
		if(client=="ADMIN") {
			return employeeDAO.get(client, empId);
		}else {
			throw new Exception("Access Denied");
		}
	}

}
