package com.himanshu.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService; 
	
	public CricketCoach() {
		System.out.println("CricketCoach : Inside No-args constructor invoked");
	}
	
	
	// setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach: Inside setter method");
	}



	@Override
	public String getDailyWorkout() {
		return "practice fast bowling for 1 hour a day"; 
	}
	
	@Override
	public String getDailyFortune() {
		fortuneService.setFortune("You'll hit 6 sixes today"); 
		return fortuneService.getFortune();
	}
}
