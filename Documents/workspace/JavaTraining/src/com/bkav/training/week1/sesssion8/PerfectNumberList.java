package com.bkav.training.week1.sesssion8;

import java.util.Scanner;

public class PerfectNumberList {
	private static Scanner in;
	public static void main(String[] args) {
		int num;
		System.out.println(" Hãy nhập vào một số:");
		in = new Scanner(System.in);
		num = in.nextInt();
		System.out.println(" Các số Perfect nhỏ hơn " + num + " là:");
		for (int i = 1; i <= num; i++) {
			if (isPerfect(i)) {
				System.out.print(i + " ");
			}
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
}
