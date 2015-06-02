package com.bkav.training.week1.sesssion7;

import java.util.Scanner;

public class SpecialSeries {
	private static Scanner in;
	public static void main(String[] args) {
		double x;
		int numTerms;
		in = new Scanner (System.in);
		System.out.println("Hãy nhập vào số x");
		x = in.nextDouble();
		System.out.println("Hãy nhập vào numTerms");
		numTerms = in.nextInt();
		System.out.println("Kết quả là: " + sumOfSeries(x, numTerms));
	}
	// Phương thức tính kết quả chuỗi số
	public static double sumOfSeries(double x, int numTerms) {
		double sum = 0;
		for (int i =1; i <= numTerms; i = i + 2) {
			sum += ((double) numerator(i) / (double) demonitor(i)) * (exponential(x, i) / (double) i);
		}
		return sum;
	}
	//Phương thức tính lũy thừa bậc 'mu' của 'num'
	public static double exponential(double num, int mu) {
		double exponential = 1;
		for (int i = 1; i <= mu; i++) {
			exponential *= num;
		}
		return exponential;
	}
	//phương thức tính tử số của từng hạng tử
	public static int numerator(int num) {
		int numer = 1;
		for (int i =1; i < num; i = i + 2) {
			numer *= i;
		}
		return numer;
	}
	//phương thức tính mẫu số của từng hạng tử
	public static int demonitor(int num){
		int demon = 1;
		for (int i =2; i < num; i = i + 2) {
			demon *= i;
		}
		return demon;
	}
}
