package com.bkav.training.week2.session13;

public class TestBall {
	public static void main(String[] args) {
		Ball ball = new Ball(1, 2, 4, 2, 7);
		System.out.println(ball);
		ball.move();
		System.out.println(ball);
		ball.reflectHorizontal();
		ball.move();
		System.out.println(ball);
	}
}
