package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class MadFortuneService implements FortuneService {

	private String fortune[] = {"first","second","third","fourth","fifth","sixth","seventh"};

	private static int getRandomNumberInRange(int min, int max) {
		Random r = new Random();
		return r.nextInt(((max-min))+min);
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune[getRandomNumberInRange(0, fortune.length)] + " " + "getFortune";
	}

}
