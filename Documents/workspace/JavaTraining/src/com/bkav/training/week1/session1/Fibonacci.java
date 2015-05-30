package com.bkav.training.week1.session1;

public class Fibonacci {
	public static void main(String[] args) {
		int f1 = 1;
		int f2 = 1;
		int n = 20;
		System.out.println(n + " so fibonaci dau tien la:");
		System.out.print(f1 + " ");
		System.out.print(f2 + " ");
		//thuat toan in ra so Fibonaci thu i
		for (int i = 3; i <= n; i++){
			System.out.print(f1 + f2 + " ");
			// xuong dong sau moi 10 so Fibonaci
			if (i % 10 == 0) {
	             System.out.println();
	        }
			int swap;
			swap = f2;
			f2 += f1;
			f1 = swap;
		}
		
	}
}
