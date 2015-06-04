package com.bkav.training.week2.session6;

import java.util.Scanner;

public class MyComplexApps {
	private static Scanner in;

	public static void main(String[] args) {
		double num1;
		double num2;
		double num3;
		double num4;

		in = new Scanner(System.in);
		System.out.println("Enter complex number 1 (real and imaginary part)");
		num1 = in.nextDouble();
		num2 = in.nextDouble();
		MyComplex com1 = new MyComplex(num1, num2);
		System.out.println("Enter complex number 2 (real and imaginary part)");
		num3 = in.nextDouble();
		num4 = in.nextDouble();
		MyComplex com2 = new MyComplex(num3, num4);
		System.out.println("Số phức 1 là: " + com1);
		if (com1.isReal()) {
			System.out.println(com1 + " Là số thực");
		} else {
			System.out.println(com1 + " Không là số thực");
		}
		System.out.println("Số phức 2 là: " + com2);
		if (com2.isReal()) {
			System.out.println(com2 + " Là số thực");
		} else {
			System.out.println(com2 + " Không là số thực");
		}
		System.out.println(com1 + " + " + com2 + " = " + com1.add(com2));
		System.out.println(com1 + " - " + com2 + " = " + com1.subtract(com2));
		System.out.println(com1 + " * " + com2 + " = " + com1.multiplyWith(com2));
		System.out.println(com1 + " / " + com2 + " = " + com1.devideBy(com2));
	}
}
