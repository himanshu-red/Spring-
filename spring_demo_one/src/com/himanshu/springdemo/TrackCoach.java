package com.himanshu.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService; 
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService; 
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k"; 
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune(); 
	}
	
	// add the init method
	public void doMyStartupStuff() {
		System.out.println("Track Coach : Inisde doMyStartupStuff method");
	}
	
	// add the destroy method
	public void doMyCleanUpStuff() {
		System.out.println("Track Coach : inside doMyCleanUpStuff method");
	}

}
