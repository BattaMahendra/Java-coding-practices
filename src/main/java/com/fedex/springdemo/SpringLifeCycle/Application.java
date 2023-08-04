package com.fedex.springdemo.SpringLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	public static void main(String[] args) {
		{
			System.out.println( "Hello World!" );
			//ApplicationContext context= new ClassPathXmlApplicationContext("Customer.xml");
			AbstractApplicationContext context= new ClassPathXmlApplicationContext("Customer.xml");
			Customer cust1=(Customer)context.getBean("customer");
			context.registerShutdownHook();
			System.out.println(cust1.hashCode());
			Customer cust2=(Customer)context.getBean("customer");
			System.out.println(cust2.hashCode());
//			Customer cust1=(Customer)context.getBean("customerbean");
//			System.out.println(cust1);
		}

	}

}
