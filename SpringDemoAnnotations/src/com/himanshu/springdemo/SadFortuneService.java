package com.himanshu.springdemo;

import org.springframework.stereotype.Component;

@ Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "fortune from sad fortune"; 
	}

}
