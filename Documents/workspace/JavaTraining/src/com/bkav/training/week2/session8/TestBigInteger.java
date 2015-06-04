package com.bkav.training.week2.session8;

import java.math.BigInteger;

public class TestBigInteger {
	public static void main(String[] args) {
		BigInteger num1 = new BigInteger("111111111111111111111111111111111111111111111111111111111111");
		BigInteger num2 = new BigInteger("511111111111222222222222222222222222222222222222222222222222222222222");
		System.out.println(num1.add(num2));
		System.out.println(num1.multiply(num2));
		System.out.println(num2.divide(num1));
	}
}
