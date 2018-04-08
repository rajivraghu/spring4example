package com.websystique.spring.domain;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


public class MyCustomEvent extends  ApplicationEvent {

	public MyCustomEvent(Object source) {
		super(source);
	}
	
	
	public String toString(){
		return "MyCustomEvent .. triggerred";
	}

}
