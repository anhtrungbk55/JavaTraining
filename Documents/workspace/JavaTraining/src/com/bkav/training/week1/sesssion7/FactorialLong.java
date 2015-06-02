package com.bkav.training.week1.sesssion7;

public class FactorialLong {
	public static void main(String[] args) {
		int n = 1;
		while (Long.MAX_VALUE / fac(n) > (n + 1)) {
			System.out.println(n + " giai thừa bằng " + fac(n));
			n++;
		}
		System.out.println("Giai thừa của " + n + " bị tràn số trong kiểu Long");
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
