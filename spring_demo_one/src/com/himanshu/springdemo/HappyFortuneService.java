package com.himanshu.springdemo;

public class HappyFortuneService implements FortuneService {

	String theFortune = "the default fortune"; 
	
	@Override
	public String getFortune() {
		return theFortune; 
	}
	
	@Override
	public void setFortune(String fortuneString) {
		theFortune = fortuneString; 
	}
}
