package com.bkav.training.week2.session5;

import com.bkav.training.week2.session3.MyPoint;

public class TestMyTriangle {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(0, 0);
		MyPoint p2 = new MyPoint(2, 0);
		MyPoint p3 = new MyPoint(0, 2);
		MyTriangle tr1 = new MyTriangle(p1, p2, p3);
		MyTriangle tr2 = new MyTriangle(1, 2, 1, 3, 2, 4);
		
		tr1.printType();
		tr2.printType();
		System.out.println(tr1);
		System.out.println(tr2);
		System.out.println(tr1.getPerimeter());
		System.out.println(tr2.getPerimeter());
	}
}
