package com.bkav.training.week2.session13;

public class Ball {
	private double x;
	private double y;
	private double  speed;
	private double xDelta;
	private double yDelta;
	private double radius;
	private double direction;
	
	public Ball(double x, double y , double radius, double speed, double direction) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.speed = speed;
		this.direction = direction;
		this.xDelta = speed * Math.cos(direction);
		this.yDelta = - speed * Math.sin(direction);
	}
	
	public void reflectHorizontal() {
		xDelta = -xDelta;
	}
	
	public void reflectVertical() {
		yDelta = -yDelta;
	}
	
	@Override
	public String toString() {
		return "Ball at ( " + x + ", " + y + ") of velocity (" + xDelta + ", " + yDelta + " )";
	}

	public void move() {
		this.x += xDelta;
		this.y += yDelta;
	}
	
	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getxDelta() {
		return xDelta;
	}

	public void setxDelta(double xDelta) {
		this.xDelta = xDelta;
	}

	public double getyDelta() {
		return yDelta;
	}

	public void setyDelta(double yDelta) {
		this.yDelta = yDelta;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDirection() {
		return direction;
	}

	public void setDirection(double direction) {
		this.direction = direction;
	}
}
