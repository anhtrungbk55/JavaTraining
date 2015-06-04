package com.bkav.training.week2.session3;

public class MyPointTest {
	public static void main(String[] args) {
		// Test program
		MyPoint p1 = new MyPoint(3, 0);
		MyPoint p2 = new MyPoint(0, 4);
		System.out.println(p1);
		System.out.println(p2);
		// Testing the overloaded method distance()
		System.out.println(p1.distance(p2)); // which version?
		System.out.println(p1.distance(5, 6)); // which version?
	}
}
