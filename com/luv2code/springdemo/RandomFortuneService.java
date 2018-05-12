package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array of strings
	private String[] myFortunes = {
		"Beware of the dogs.. they might bite you today.",
		"Today will be the best day of your life.",
		"You will get some new good friends today."
	};
	
	//generate a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//Pick a random string from array
		int index = myRandom.nextInt(myFortunes.length);
		String theFortune = myFortunes[index];
		
		return theFortune;
	}

}
