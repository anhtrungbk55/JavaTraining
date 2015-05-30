package com.bkav.training.week1.session1;

public class PrintDayInWord {
	public static void main(String[] args) {
		int number = 5;
	    
		// Using switch-case
		switch(number) {
		case 2: 
			System.out.println("MONDAY");
			break;
		case 3: 
			System.out.println("TUESDAY");
			break;
		case 4: 
			System.out.println("WENESDAY");
			break;
		case 5: 
			System.out.println("THURSDAY");
			break;
		case 6: 
			System.out.println("FRIDAY");
			break;
		default : 
			System.out.println("NOT A VALID DAY");
			break;
		}
	}
}
