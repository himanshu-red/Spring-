package com.himanshu.springdemo;

import org.springframework.stereotype.Component;

@Component
public class dbmsFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "fortune from dbms fortune service"; 
	}

}
