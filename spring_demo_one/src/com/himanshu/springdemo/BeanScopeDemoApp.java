package com.himanshu.springdemo;

import java.sql.Connection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beenScope-applicationContect.xml"); 
		
		// retrieve bean from  the configuration file
		Coach theCoach = context.getBean("myCoach", Coach.class); 
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach); 
		
		System.out.println(result);
		
		System.out.println("memory location of theCoach : " + theCoach);
		System.out.println("memory loction of the alphaCoach : " + alphaCoach);
		
		context.close();
	}

}
