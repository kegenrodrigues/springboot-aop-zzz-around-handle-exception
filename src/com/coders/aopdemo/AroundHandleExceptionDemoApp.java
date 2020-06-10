package com.coders.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coders.aopdemo.service.TrafficFortuneService;

public class AroundHandleExceptionDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from the spring container
		TrafficFortuneService theTrafficFortuneService = context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		System.out.println("Calling getFortune");
		
		boolean tripwire = true;
		String fortuneMessage = theTrafficFortuneService.getFortune(tripwire);
		System.out.println(fortuneMessage);
		System.out.println("Finished");
		//close the context
		context.close();

	}

}
