package com.himanshu.springdemo;

public class BaseballCoach implements Coach{
		
		// private FortuneService fortuneService; 
		private FortuneService fortuneService; 
	
		
		// define a constructor for dependency injection
		public BaseballCoach(FortuneService theFortuneService) {
			fortuneService  = theFortuneService; 
		}
		
		@Override
		public String getDailyWorkout() {
			return "Spend 20 minutes on batting practice"; 
		}

		@Override
		public String getDailyFortune() {
			fortuneService.setFortune("You'll throw the ball 500 meters far");
			return fortuneService.getFortune(); 
		}
}
