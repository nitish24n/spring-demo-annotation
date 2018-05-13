package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define default constructor
	public TennisCoach() {
		System.out.println(">> inside tennis coach constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println(">>tennicCoach : inside domy-startupstuff method");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyShutdownStuff() {
		System.out.println(">>tennicCoach : inside domy-shutdownstuff method");
	}
	
	/*
	@Autowired
	//define a setter method
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> inside doSomeCrazyStuff() method");
		fortuneService = theFortuneService;
	}
	*/
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
