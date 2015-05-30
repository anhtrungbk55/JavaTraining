package com.bkav.training.week1.session1;

public class SumAndAverageOdd {
	public static void main(String[] args) {
		int sum = 0;          // store the accumulated sum, init to 0
	    double average;       // average in double
	    int lowerBound = 1;   // the lower bound to sum
	    int upperBound = 100; // the upper bound to sum
	    for (int number = lowerBound; number <= upperBound; ++number) { 
	        if (number % 2 == 1){ 
	        	sum += number;     // same as "sum = sum + number"
	        }
	    }
	    
	    // Compute average in double. Beware that int/int produces int.
	    average = (double) sum / 100; 
	     
	    // Print sum and average.
	    System.out.println("sum =" + sum);
	    System.out.println("average =" + average);
	 }
}
