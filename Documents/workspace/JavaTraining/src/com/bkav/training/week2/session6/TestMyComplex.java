package com.bkav.training.week2.session6;

public class TestMyComplex {
	public static void main(String[] args) {
		MyComplex com1 = new MyComplex(1, 3);
		MyComplex com2 = new MyComplex(2, -4);
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com1.isImagine());
		System.out.println(com1.isReal());
		System.out.println(com1.equals(com2));
		System.out.println(com1.magnitude());
		System.out.println(com1.add(com2));
		System.out.println(com1.subtract(com2));
		System.out.println(com1.multiplyWith(com2));
		System.out.println(com1.devideBy(com2));
		System.out.println(com1.argumentInRadians());
		System.out.println(com1.argumentInDegrees());
	}
}
