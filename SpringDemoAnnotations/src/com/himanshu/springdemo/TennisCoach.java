package com.himanshu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Value("${foo.email}")
	private String email; 
	
	@Value("${foo.username}")
	private String username; 
	
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService; 
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> inside default constructor of TennisCoach class");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand Volley"; 
	}

	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public String getUsername() {
		return username;
	}
	
	

}
