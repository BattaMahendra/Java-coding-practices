package com.fedex.springdemo.SpringLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Customer {
	//init , destroy
//implements InitializingBean,DisposableBean {
	
	public Customer(Integer cutsomerId, String username, String password) {
		super();
		this.cutsomerId = cutsomerId;
		this.username = username;
		this.password = password;
	}

	private Integer cutsomerId;
	private String username;
	private String password;
	public Integer getCutsomerId() {
		return cutsomerId;
	}
	public void setCutsomerId(Integer cutsomerId) {
		this.cutsomerId = cutsomerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("after properties set");
//	}
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("after bean destroyed");
//	}
	@PostConstruct
	public void start() {
		System.out.println("after properties set");
	}
	@PreDestroy
	public void end()  {
		System.out.println("after bean destroyed");
	}
	@Override
	public String toString() {
		return "Customer [cutsomerId=" + cutsomerId + ", username=" + username + ", password=" + password + "]";
	}
}
