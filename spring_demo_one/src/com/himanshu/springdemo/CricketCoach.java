package com.himanshu.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService; 
	private String emailAddress; 
	private String team; 
	
	public CricketCoach() {
		System.out.println("CricketCoach : Inside No-args constructor invoked");
	}
	
	// setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach: Inside set fortune service method");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside set email address method");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside set team address method");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "practice fast bowling for 1 hour a day"; 
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune(); 
	}
	
	public void initMethod() {
		System.out.println("hello from init method");
	}
	
	public void destroyMethod() {
		System.out.println("bye from init method");
	}

	
}
