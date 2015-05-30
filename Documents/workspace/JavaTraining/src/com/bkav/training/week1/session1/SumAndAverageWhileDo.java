package com.bkav.training.week1.session1;

public class SumAndAverageWhileDo {
	public static void main(String[] args) {
		int sum = 0;          // store the accumulated sum, init to 0
	    double average;       // average in double
	    int lowerBound = 1;   // the lower bound to sum
	    int upperBound = 100; // the upper bound to sum
	    while(lowerBound <= upperBound){
	    	sum += lowerBound;
	    	lowerBound++;
	    }
	    average = (double) sum / 100; 
	     
	    // Print sum and average.
	    System.out.println("sum =" + sum);
	    System.out.println("average =" + average);
	}
}
