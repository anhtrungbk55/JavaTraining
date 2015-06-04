package com.bkav.training.week2.session4;

import com.bkav.training.week2.session3.MyPoint;

public class MyCircle {
	private MyPoint center;
	private int radius;

	public MyCircle(int x, int y, int radius) {
		this.center = new MyPoint(x, y);
		this.radius = radius;
	}

	public MyCircle(MyPoint point, int radius) {
		this.center = point;
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}
	
	public void setCenter(int x, int y) {
		this.center.setXY(x, y);
	}

	@Override
	public String toString() {
		return "Circle @" + center + " radius = " + radius ;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea () {
		return Math.PI * radius * radius;
	}

}
