package com.bkav.training.week2.session3;

import com.bkav.training.week2new.session3_1.Line;
import com.bkav.training.week2new.session3_1.Point;

public class TestSubLine {
	public static void main(String[] args) {
		Line l1 = new Line(0, 0, 3, 4);
		System.out.println(l1);

		Point p1 = new Point(1, 2);
		Point p2 = new Point(-1, 4);
		Line l2 = new Line(p1, p2);
		System.out.println(l2);
		System.out.println(l1.getLength());
		System.out.println(l2.getLength());
		System.out.println(l2.getGradient());
	}
}
