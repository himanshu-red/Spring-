package com.himanshu.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	String[] theFortune = {"fortune 1", "fortune 2", "fortune 3", "fortune 3", "fortune 4", "fortune 5", "fortune 6", "fortune 7"}; 
	
	@Override
	public String getFortune() {
		return theFortune[(int)(Math.random() * 10) % theFortune.length]; 
	}
	
}
