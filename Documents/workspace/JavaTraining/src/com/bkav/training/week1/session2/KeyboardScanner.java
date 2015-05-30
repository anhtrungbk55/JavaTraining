package com.bkav.training.week1.session2;

import java.util.Scanner;

public class KeyboardScanner {
	private static Scanner in;

	public static void main(String[] args) {
		int num1;
	    double num2;
	    String name;
	    
	    in = new Scanner(System.in);
	    System.out.print("Enter an integer: ");
	    num1 = in.nextInt();     // use nextInt() to read int
	    System.out.print("Enter a floating point number: ");
	    num2 = in.nextDouble();  // use nextDouble() to read double
	    System.out.print("Enter your name: ");
	    name = in.next();        // use next() to read String
	    System.out.print("Hi " + name + ", the sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
	}
}
