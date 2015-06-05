package com.bkav.training.week2new.session4_3;

public class MovablePoint implements Movable{
	@Override
	public String toString() {
		return "point:(" + x + ", " + y + "), speed:(" + xSpeed + ", " + ySpeed + ")";
	}

	int x, y, xSpeed, ySpeed;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUp() {
		y -= ySpeed;
	}

	@Override
	public void moveDown() {
		y += ySpeed;
	}

	@Override
	public void moveLeft() {
		x -= xSpeed;
	}

	@Override
	public void moveRight() {
		x += xSpeed;
	}
}
