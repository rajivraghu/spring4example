package com.websystique.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class CustomerImpl implements Customer{
	
	@Autowired
	HelloWorld hw;
	@Autowired
	ApplicationEventPublisher publisher;

	public void displayCustomerName() {
		System.out.println("Customer ");
		hw.sayHello("Rajiv");
		MyCustomEvent event = new MyCustomEvent(this);
		publisher.publishEvent(event);
		
	}

}
