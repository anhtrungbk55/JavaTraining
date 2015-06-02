package com.bkav.training.week1.sesssion7;

import java.util.Scanner;

public class NumberGuess {
	private static Scanner in;

	public static void main(String[] args) {
		int secretNumber = (int)(Math.random()*100);
		int couter = 0;
		boolean check = false;
		int guess;
		
		in = new Scanner(System.in);
		System.out.println(" Hãy nhập vào số dự đoán:");
		guess = in.nextInt();
		while (check == false) {
			couter++;
			if (guess > secretNumber) {
				System.out.println(" Số bạn đoán cao hơn rồi, hãy đoán lại:");
				guess = in.nextInt();
			} else if (guess < secretNumber) {
				System.out.println(" Số bạn đoán thấp hơn rồi, hãy đoán lại:");
				guess = in.nextInt();
			} else if (guess == secretNumber) {
				System.out.println(" Bạn đoán đúng, số lân đoán của bạn là: " + couter);
				check = true;
			}
		}
	}
}
