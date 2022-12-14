package com.himanshu.springdemo;

import java.sql.Connection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the configuration file
		ClassPathXmlApplicationContext context = new 		ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml"); 
		
		// retrieve bean from  the configuration file
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
