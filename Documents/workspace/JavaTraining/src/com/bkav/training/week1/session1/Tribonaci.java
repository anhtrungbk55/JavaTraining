package com.bkav.training.week1.session1;

public class Tribonaci {
	public static void main(String[] args) {
		int f1 = 1;
		int f2 = 1;
		int f3 = 2;
		int n = 20;
		System.out.println(n + " so fibonaci dau tien la:");
		System.out.print(f1 + " ");
		System.out.print(f2 + " ");
		System.out.print(f3 + " ");
		//thuat toan in ra so Tribonaci thu i
		for (int i = 4; i <= n; i++){
			System.out.print(f1 + f2 + f3 + " ");
			// xuong dong sau moi 10 so Fibonaci
			if (i % 10 == 0) {
	             System.out.println();
	        }
			int swap; // bien trung gian de gan lai f1 f2 
			swap = f3;
			f3 += f1 + f2;
			f1 = f2;
			f2 = swap;
		}
		
	}
}
