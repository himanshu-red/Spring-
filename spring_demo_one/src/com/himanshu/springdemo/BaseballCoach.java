package com.himanshu.springdemo;

public class BaseballCoach implements Coach{
		
		@Override
		public String getDailyWorkout() {
			return "Spend 20 minutes on batting practice"; 
		}
}
