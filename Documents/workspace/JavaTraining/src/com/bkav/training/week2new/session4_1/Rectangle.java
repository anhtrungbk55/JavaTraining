package com.bkav.training.week2new.session4_1;

public class Rectangle extends Shape {
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	private double width;
	private double length;

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle() {
		super();
		this.width = 1;
		this.length = 1;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Hình chữ nhật kích thước (" + width + ", " + length
				+ ") là subclass của " + super.toString();
	}

	@Override
	public double getPerimeter() {
		return 2 * width + 2 * length;
	}

	@Override
	public double getArea() {
		return width * length;
	}
}
