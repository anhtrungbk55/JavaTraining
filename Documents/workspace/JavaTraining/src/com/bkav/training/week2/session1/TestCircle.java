package com.bkav.training.week2.session1;

public class TestCircle {
	public static void main(String[] args) {
		// Declare and allocate an instance of class Circle called c1
		// with default radius and color
		Circle c1 = new Circle();
		// Use the dot operator to invoke methods of instance c1.
		System.out.println("The circle has radius of " + c1.getRadius()
				+ " and area of " + c1.getArea());

		// Declare and allocate an instance of class circle called c2
		// with the given radius and default color
		Circle c2 = new Circle(2.0);
		// Use the dot operator to invoke methods of instance c2.
		System.out.println("The circle has radius of " + c2.getRadius()
				+ " and area of " + c2.getArea());
		Circle c3 = new Circle(2.0, "blue");
		System.out.println("The circle has radius of " + c3.getRadius()
				+ " and area of " + c3.getArea());
		c3.setColor("white");
		c3.setRadius(3);
		System.out.println("The circle has radius of " + c3.getRadius()
				+ " and area of " + c3.getArea());
		Circle c4 = new Circle(5.0);
		System.out.println(c4.toString());
		System.out.println(c4);
	}
}
