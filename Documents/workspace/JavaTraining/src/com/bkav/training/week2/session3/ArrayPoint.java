package com.bkav.training.week2.session3;

public class ArrayPoint {
	public static void main(String[] args) {
		MyPoint[] array = new MyPoint[10];
		
		// khoi tao mang array
		for (int i = 0; i < 10; i++) {
			array[i] = new MyPoint(i + 1, i + 1);
		}
		
		// in mang array
		for (int i = 0; i < 10; i++) {
			System.out.println(array[i]);
		}
	}
}
