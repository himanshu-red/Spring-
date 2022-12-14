package com.himanshu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the configuration file
		ClassPathXmlApplicationContext context = new 				ClassPathXmlApplicationContext("beenLifeCycleApplicationContext2.xml"); 
		
		// retrieve bean from  the configuration file
		Coach theCoach = context.getBean("theCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}
}
