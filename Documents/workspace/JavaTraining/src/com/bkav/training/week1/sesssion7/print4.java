package com.bkav.training.week1.sesssion7;

public class print4 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if ((j > (5 - i)) && (j < (5 + i))) {
					System.out.print("#");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}
