package com.himanshu.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService; 
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService; 
	}
	
	@Override
	public String getDailyWorkout() {
		return "Bring the bats and wickets."; 
	}

	
	@Override
	public String getDailyFortune() {
		fortuneService.setFortune("You'll hit 6 sixes today"); 
		return fortuneService.getFortune();
	}
}
