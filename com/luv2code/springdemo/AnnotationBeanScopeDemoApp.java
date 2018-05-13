package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		//check if they are the same
		boolean result = theCoach == alphaCoach;
		System.out.println("\nPointing to the same object : "+result);
		System.out.println("\nMemory Addr of theCoach : "+theCoach);
		System.out.println("\nMemory Addr of alphaCoach : "+alphaCoach); 
		
		
		//close the context
		context.close();
	}

}
