package com.websystique.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.configuration.HelloWorldConfig;
import com.websystique.spring.domain.Customer;
import com.websystique.spring.domain.HelloWorld;

public class AppMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		Customer cust = (Customer)context.getBean("customerImpl");
		System.out.println(cust.hashCode());
		Customer cust2 = (Customer)context.getBean("customerImpl");
		System.out.println(cust2.hashCode());
		cust.displayCustomerName();
		//Hello from git
		// This is automatically sync
	/*	HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
		bean.sayHello("Spring 4");*/
		//context.close();
		
		//local push  ddd
		
		// abac
		//jjjx
 //kk
	}

}
