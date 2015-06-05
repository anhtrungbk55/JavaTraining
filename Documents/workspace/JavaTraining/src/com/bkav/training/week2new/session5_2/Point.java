package com.bkav.training.week2new.session5_2;

public class Point {
	private int x;
	private int y;

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public double distance(int x, int y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y)
				* (this.y - y));
	}
	
	public double distance(Point otherPo) {
		return Math.sqrt((double) ((this.x - otherPo.x) * (this.x - otherPo.x) + (this.y - otherPo.y)
				* (this.y - otherPo.y)));
	}
	
}
