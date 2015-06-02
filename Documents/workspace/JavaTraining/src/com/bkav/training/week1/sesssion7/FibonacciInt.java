package com.bkav.training.week1.sesssion7;

import java.util.Scanner;

public class FibonacciInt {
	private static Scanner in;

	public static void main(String[] args) {
		int f1 = 1;
		int f2 = 1;
		int lim;
		
		in = new Scanner (System.in);
		System.out.println("hãy nhập vào giới hạn ");
		lim = in.nextInt();
		System.out.println("các số fibonaci nhỏ hơn " + lim + " là:");
		System.out.print(f1 + " ");
		System.out.print(f2 + " ");
		//thuat toan in ra so Fibonaci thu i
		while ((f1 + f2) < lim){
			System.out.print(f1 + f2 + " ");
			// xuong dong sau moi 10 so Fibonaci
			int swap;
			swap = f2;
			f2 += f1;
			f1 = swap;
		}
		
	}
}
