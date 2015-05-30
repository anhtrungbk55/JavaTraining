package com.bkav.training.week1.session1;

public class ComputePI {
	public static void main(String[] args){
		int maxDenom =10000000;
		double sum = 0;
		for (int denom = 1; denom <= maxDenom; denom = denom + 2){
			if (denom % 4 == 1) {
				sum += 1 / (double) denom;
			}
			if (denom % 4 == 3){
				sum -= 1 / (double) denom;
			}
		}
		System.out.println("so PI la " + 4*sum);
	}
}
