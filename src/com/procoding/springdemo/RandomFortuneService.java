package com.procoding.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward",
			"Success is a Journey",
			"Invest in a mutual funds and equity",
			"Always invest in large Cap",
			"Technology is the only solution",
			"Invest in Infy,TCs,HCL",
			"Technology is the only solution",
			"Learn full stack Technology",
			"Be your own Boss!!",
			"Life is hell",
			"Testing rebase and merge"
	};
	
	// create a random number generator
	private Random myRandom = new Random();
		
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}


