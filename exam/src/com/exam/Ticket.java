package com.exam;


public class Ticket {
	int number;
	int number1;
	int tickets;
	int round;
	
	public void tickets(int number,int number1){
		this.number = number;
		this.number1 = number1;
	}
	
	public void ticket(){
		System.out.println("Please enter number of tickets:");
	}
	public void round(){
		System.out.println("How many round-trip tickets:");
		
	}

}
