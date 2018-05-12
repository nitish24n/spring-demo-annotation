package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//define default constructor
	public TennisCoach() {
		System.out.println(">> inside tennis coach constructor");
	}
	
	@Autowired
	//define a setter method
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> inside doSomeCrazyStuff() method");
		fortuneService = theFortuneService;
	}
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;   
	}
	*/
	@Override
	public String getDailyWorkout() {
		
		return "Practise your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
