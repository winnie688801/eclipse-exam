package com.exam;

import java.util.Random;

public class Secret {
	int secret;
	public Secret(){
		Random random = new Random();	
		secret = random.nextInt(10)+1;
		System.out.println(secret);
	}
	public int guess(int number){
		return secret - number;
	}
	
	public void first(){
		System.out.println("Please guess a number:");
	}
	
	public void second(){
		System.out.println("Lower");
	}
	
	public void third(){
		System.out.println("Higher");
	}

}
