package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("baseballCoach", Coach.class);
		FortuneService fortuneService = context.getBean("happyFortuneService", FortuneService.class);

		System.out.println(coach.getDailyFortune());
		System.out.println(fortuneService.getFortune());

		context.close();
	}

}
