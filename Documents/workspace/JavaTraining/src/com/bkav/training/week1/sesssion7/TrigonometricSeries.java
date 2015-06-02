package com.bkav.training.week1.sesssion7;

import java.util.Scanner;

public class TrigonometricSeries {
	private static Scanner in;
	public static void main(String[] args) {
		double x;
		int y;
		
		in = new Scanner (System.in);
		System.out.println("hãy nhập vào góc cần tính theo đơn vị Rađian");
		x = in.nextDouble();
		System.out.println("Cos (" + x + ") = " + cos(x, 100));
		System.out.println("Sin (" + x + ") = " + sin(x, 100));
		System.out.println("Nhap 1 Number");
		y = in.nextInt();
		System.out.println("Fac (" + y + ") = " + fac(y));
		System.out.println("lũy thừa (" + x + ") = " + exponential(x, 3));
		
	}
	//Phương thức tính Sin
	public static double sin(double x, int numTerms){
		double sin = 0;
		for (int i = 1; i < numTerms; i = i+2) {
			 if (i % 4 == 1) {
				 sin += exponential(x, i) / (double) fac(i);
			 }
			 if (i % 4 == 3) {
				 sin -= exponential(x, i) / (double) fac(i);
			 }
		}
		return sin;
	}
	// Phương thức tính Cos
	public static double cos(double x, int numTerms){
		double cos = 0;
		for (int i = 0; i < numTerms; i = i+2) {
			 if (i % 4 == 0) {
				 cos += exponential(x, i) / (double) fac(i);
			 }
			 if (i % 4 == 2) {
				 cos -= exponential(x, i) / (double) fac(i);
			 }
		}
		return cos;
	}
	//phương thức tính giai thừa của 'num'
	public static  int fac(int num) {
		int fac = 1;
		for (int i =1; i <= num; i++) {
			fac *= i;
		}
		return fac;
	}
	// phương thức tính lũy thừa bậc 'mu' cua 'num'
	public static double exponential(double num, int mu) {
		double exponential = 1;
		for (int i = 1; i <= mu; i++) {
			exponential *= num;
		}
		return exponential;
	}
}
