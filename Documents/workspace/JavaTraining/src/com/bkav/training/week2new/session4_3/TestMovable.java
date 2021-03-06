package com.bkav.training.week2new.session4_3;

public class TestMovable {
	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5, 6, 10, 12); // upcast
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);

		Movable m2 = new MovableCircle(2, 1, 2, 3, 20); // upcast
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
		
		Movable m3 = new MovableRectangle(1, 2, 2, 4, 3, 5);
		System.out.println(m3);
		m3.moveLeft();
		System.out.println(m3);
	}
}
