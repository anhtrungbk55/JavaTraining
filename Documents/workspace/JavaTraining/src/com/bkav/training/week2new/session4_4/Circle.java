package com.bkav.training.week2new.session4_4;

public class Circle implements GeometricObject{
	protected double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.PI * radius;
	}
}
