package com.websystique.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.websystique.spring.domain.HelloWorld;
import com.websystique.spring.domain.HelloWorldImpl;

@Configuration
@ComponentScan(basePackages = {"com.websystique.*" })
public class HelloWorldConfig {

	@Bean(name="helloWorldBean")
	public HelloWorld helloWorld() {
		HelloWorld helloWorld = new HelloWorldImpl();
		return helloWorld;
	}

}
