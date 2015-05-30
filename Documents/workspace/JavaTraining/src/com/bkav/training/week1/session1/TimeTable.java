package com.bkav.training.week1.session1;

public class TimeTable {
	public static void main(String[] args){
		System.out.print("* | ");
		for (int i = 1; i <= 9; i++){
			System.out.print(i + "  ");
		}
		System.out.println("");
		for (int i = 0; i <= 10; i++){
			System.out.print("-  ");
		}
		System.out.println("");
		for (int i = 1; i <= 9; i++){
			System.out.print(i + " | ");
			for (int j = 1; j <=9; j++){
				System.out.print(j*i + "  ");
			}
			System.out.println("");
		}
	}
}
