package com.bkav.training.week1.session1;

public class Product1ToN {
	public static void main(String[] args){
		int pro = 1;          
		int lowerBound = 1;   // the lower bound to sum
		int upperBound = 10; // the upper bound to sum
		for (int number = lowerBound; number <= upperBound; ++number) { 
			pro *= number;     // same as "sum = sum * number"
		}
    // Print sum and average.
    System.out.println("product =" + pro);
	}
}
