package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

//	@Autowired
//	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	//define a default constructor
//	public BaseballCoach() {
//		this.fortuneService = fortuneService;
//	}

	@Autowired
	public BaseballCoach(@Qualifier("madFortuneService")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}








