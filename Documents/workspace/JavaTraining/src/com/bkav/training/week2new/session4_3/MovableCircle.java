package com.bkav.training.week2new.session4_3;

public class MovableCircle implements Movable {
	// instance variables
	private MovablePoint center; // can use center.x, center.y directly
									// because they are package accessible
	private int radius;

	// Constructor
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		// Call the MovablePoint's constructor to allocate the center instance.
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	public MovableCircle(MovablePoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	// Implement abstract methods declared in the interface Movable
	@Override
	public void moveUp() {
		center.y -= center.ySpeed;
	}

	@Override
	public void moveDown() {
		center.y += center.ySpeed;
	}

	@Override
	public String toString() {
		return "Circle bán kính: " + radius + ", tâm " + center.toString();
	}

	@Override
	public void moveLeft() {
		center.x -= center.xSpeed;
	}

	@Override
	public void moveRight() {
		center.x += center.xSpeed;
	}
}
