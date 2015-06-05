package com.bkav.training.week2new.session4_4;

public class Test {
	public static void main(String[] args) {
		Circle c1 = new Circle(4);
		System.out.println(c1.radius);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		
		ResizableCircle c2 = new ResizableCircle(5);
		System.out.println(c2.radius);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		c2.resize(50);
		System.out.println(c2.radius);
	}
}
