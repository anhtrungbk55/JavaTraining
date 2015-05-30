package com.bkav.training.week1.sesssion8;

import java.util.Scanner;

public class Numbers {
	private static Scanner in;
	public static void main(String[] args) {
		int num;
		System.out.println(" Hãy nhập vào một số:");
		in = new Scanner(System.in);
		num = in.nextInt();
		if (isPerfect(num)) {
			System.out.print(" Đây là số Perfect");
		}
		else if ( isDeficient(num)) {
			System.out.print(" Đây là số Deficient");
		} else {
			System.out.print(" Đây không là số Per cũng ko phải số Def");
		}
	}
	public static boolean isPerfect(int num){
		boolean check;
		int sumDiv = 0;
		
		for (int i = 1; i <= ((num / 2) + 1); i++){
			if (num % i == 0) {
				sumDiv += i;
			}
		}
		if (sumDiv == num) {
			check = true;
		} else {
			check = false;
		}
		return check;
	}
	public static boolean isDeficient(int num){
		boolean check = true;
		int sumDiv = 0;
		
		for (int i = 1; i <= ((num / 2) + 1); i++){
			if (num % i == 0) {
				sumDiv += i;
			}
		}
		if (sumDiv < num) {
			check = true;
		} else {
			check = false;
		}
		return check;
	}
}
