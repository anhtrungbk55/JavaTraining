package com.bkav.training.week2.session5;

import com.bkav.training.week2.session3.MyPoint;

public class MyTriangle {
	private MyPoint pointA;
	private MyPoint pointB;
	private MyPoint pointC;

	public MyTriangle(int xA, int yA, int xB, int yB, int xC, int yC) {
		this.pointA = new MyPoint(xA, yA);
		this.pointB = new MyPoint(xB, yB);
		this.pointC = new MyPoint(xC, yC);
	}

	public MyTriangle(MyPoint pointA, MyPoint pointB, MyPoint pointC) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	@Override
	public String toString() {
		return "Triangle @ " + pointA + pointB + pointC;
	}

	public double getPerimeter() {
		return pointA.distance(pointB) + pointA.distance(pointC)
				+ pointC.distance(pointB);
	}

	public void printType() {
		if ((pointA.distance(pointC) == pointA.distance(pointB))
				&& (pointA.distance(pointC) == pointB.distance(pointC))
				&& (pointB.distance(pointC) == pointA.distance(pointB))) {
			System.out.println("Đây là tam giác đều");
		} else if ((pointA.distance(pointC) == pointA.distance(pointB))
				|| (pointA.distance(pointC) == pointB.distance(pointC))
				|| (pointB.distance(pointC) == pointA.distance(pointB))) {
			System.out.println("Đây là tam giác cân");
		} else {
			System.out.println("Đây là tam giác bình thường");
		}
	}
}
