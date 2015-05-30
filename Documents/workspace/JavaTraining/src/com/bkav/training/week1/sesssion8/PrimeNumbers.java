package com.bkav.training.week1.sesssion8;

import java.util.Scanner;

public class PrimeNumbers {
	private static Scanner in;
	public static void main(String[] args) {
		int num;
		System.out.println("Hãy nhập vào giới hạn trên");
		in = new Scanner(System.in);
		num = in.nextInt();
		System.out.println("Các số nguyên tố nhỏ hơn " + num + " là:");
		for ( int i = 3; i <= num; i++) {
			if (isPrime(i)) {
				System.out.print(i + "  ");
			}
		}
	}
	public static boolean isPrime(int num) {
		boolean check = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				check = false;
			}
		}
		return check;
	}
}
