package com.himanshu.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	@Autowired
	@Value("${foo.fortunes}")
	private String[] fortunes ;
	
	private Random myRandom = new Random(); 
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortunes.length); 
		return fortunes[index] ;
	}

}
