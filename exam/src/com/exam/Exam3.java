package com.exam;

import java.util.Random;
import java.util.Scanner;

public class Exam3 {
    /* 蝚砌���  ��摮��� 20��� 
		1. �������1�10���嚗蟡�摮� (��身�7)
		2. 霈蝙�����摮����:
		Your guess: 5(雿輻���5)
		3. ��內雿輻����暺���暺�������甈∴����:
		higher
		Your guess: 9(雿輻���9)
		lower
		4. �雿輻��葉蟡�摮���:
		Great! The secret number is 7
		
		��內: �while餈游�葉�雿輻break��誘頝喳餈游����
		��� ����憿閮剛���迨憿���策����
		
	    蝚砍��� 閮��嗾甈� 10���
	        �蝚砌�����蝙����活隞亙(��鈭活)������＊蝷�:
	   Excellent! The secret number is 7

    */
	public static void main(String[] args) {
		Secret secret = new Secret();
		Scanner scanner = new Scanner(System.in);
		int diff = -1;
		System.out.println();

		
		while(diff != 0 ){
			System.out.println("Please guess a number:");
			int number = scanner.nextInt();
			diff = secret.guess(number);
			if(diff>0){
				System.out.println("Your guess : " + number);
				System.out.println("Higher");
			}
			
			else if(diff<0){
				System.out.println("Your guess : " + number);
				System.out.println("Lower");
			}
			
			else if(diff==0){
					System.out.println("Great! The secret number is " + secret.secret);
				break;
			}
		}
	}
}
