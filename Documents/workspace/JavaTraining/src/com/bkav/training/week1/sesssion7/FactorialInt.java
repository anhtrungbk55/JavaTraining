package com.bkav.training.week1.sesssion7;

public class FactorialInt {
	public static void main(String[] args) {
		int n = 1;
		while (Integer.MAX_VALUE / fac(n - 1) > (n)) {
			System.out.println(n + " giai thừa bằng " + fac(n));
			n++;
		}
		System.out.println("Giai thừa của " + n + " bị tràn số trong kiểu Int");
	}
	//phương thức tính giai thừa của 'num'
	public static  int fac(int num) {
		int fac = 1;
		for (int i =1; i <= num; i++) {
			fac *= i;
		}
		return fac;
	}
}
