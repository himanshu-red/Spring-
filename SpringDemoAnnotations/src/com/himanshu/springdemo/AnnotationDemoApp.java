package com.himanshu.springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class); 
		
		// call some methods
		System.out.println(theCoach.getDailyWorkout());
		
		
		// call the method for fortune service
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getUsername());
		System.out.println(theCoach.getEmail());
		// close the context.
		context.close(); 
	}
}
