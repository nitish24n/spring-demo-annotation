package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public SwimCoach() {
		System.out.println("inside swimCoach constructor");
	}
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	@Override
	public String getDailyWorkout() {
		System.out.println("Email : "+email);
		System.out.println("team : "+team);
		return "Do backstrokes for 15 minuters.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
