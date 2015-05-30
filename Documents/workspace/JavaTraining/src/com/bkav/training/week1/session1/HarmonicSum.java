package com.bkav.training.week1.session1;

public class HarmonicSum {
	public static void main(String[] args) {
		int maxDenominator =5000;
		double HarmonicSum =0;
		for (int Denominator = 1; Denominator <= maxDenominator; Denominator++){
			HarmonicSum += 1 / (double) Denominator;
		}
		System.out.println("HarmonucSum = " + HarmonicSum);
	}
}
