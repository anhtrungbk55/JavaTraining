package com.bkav.training.week2new.session4_1;

public class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
		this.radius = 1;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "A Circle with radius=" + radius + ", which is a subclass of "
				+ super.toString();
	}

	@Override
	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
