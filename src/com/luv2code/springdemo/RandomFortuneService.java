package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] moods = { 
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	Random random = new Random();
		
	@Override
	public String getFortune() {
		int index = random.nextInt(moods.length);
		return moods[index];
		
	}

}
