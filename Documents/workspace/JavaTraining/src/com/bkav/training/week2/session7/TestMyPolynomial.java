package com.bkav.training.week2.session7;

public class TestMyPolynomial {
	public static void main(String[] args) {
		MyPolynomial po1 = new MyPolynomial(1, 2, 3, 4, 5);
		MyPolynomial po2 = new MyPolynomial(2, 2, 3, 5, 5, 1, 1);
		MyPolynomial po3 = new MyPolynomial("poly");
		MyPolynomial po4 = new MyPolynomial(1, 2, 3);
		MyPolynomial po5 = new MyPolynomial(7, 2);
		
		System.out.println(po1);
		System.out.println(po2);
		System.out.println(po3);
		System.out.println(po1.evaluate(2));
		System.out.println(po1.add(po2));
		System.out.println(po2.add(po1));
		System.out.println(po2.add(po3));
		System.out.println(po4.multi(po5));

	}
}
