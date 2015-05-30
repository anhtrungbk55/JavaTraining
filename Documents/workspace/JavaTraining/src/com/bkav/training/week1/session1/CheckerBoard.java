package com.bkav.training.week1.session1;

public class CheckerBoard {
	public static void main(String[] args) {
		int size = 5;
		for (int row = 1; row <= size; row++){
			if(row % 2 == 1){
				for (int col = 1; col <= size; col++){
					System.out.print(" #");
				}
			} else {
				for (int col = 1; col <= size; col++){
					System.out.print("# ");
				}
			}
		System.out.println("");
		}
	}
}
