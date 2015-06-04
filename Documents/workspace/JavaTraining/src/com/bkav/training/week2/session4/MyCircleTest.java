package com.bkav.training.week2.session4;

import com.bkav.training.week2.session3.MyPoint;

public class MyCircleTest {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(1, 1);
		MyCircle c1 = new MyCircle(p1, 1);
		MyCircle c2 = new MyCircle(2, 2, 2);
		System.out.println(c1);
		System.out.println("Đường tròn c2: " + c2);
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		c2.setCenter(p1);
		System.out.println("Đường tròn c2: " + c2);
		c2.setCenter(4, 5);
		System.out.println("Đường tròn c2: " + c2);
		c2.setRadius(7);
		System.out.println("Đường tròn c2: " + c2);
	}
}
