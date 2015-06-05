package com.bkav.training.week2.session3;

import com.bkav.training.week2new.session3_1.Point;

public class LineSub extends Point {
	private Point end;
	
	// Constructors
	public LineSub(int beginX, int beginY, int endX, int endY) {
		super(beginX, beginY); // construct the begin Point
		this.end = new Point(endX, endY); // construct the end Point
	}

	public LineSub(Point begin, Point end) { // caller to construct the Points
		super(begin.getX(), begin.getY()); // need to reconstruct the begin
											// Point
		this.end = end;
	}
	
	public Point getBegin() {
		return new Point(getX(), getY());
	}

	public void setBegin(Point begin) {
		setXY(begin.getX(), begin.getY());
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public int getBeginX() {
		return getX();
	}

	public int getBeginY() {
		return getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public void setBeginX(int beginX) {
		setX(beginX);
	}

	public void setBeginY(int beginY) {
		setY(beginY);
	}

	public void setBeginXY(int beginX, int beginY) {
		setX(beginX);
		setY(beginY);
	}

	public void setEndX(int endX) {
		end.setX(endX);
	}

	public void setEndY(int endY) {
		end.setY(endY);
	}

	public void setEndXY(int endX, int endY) {
		end.setX(endX);
		end.setY(endY);
	}

	public double getLength() {
		return Math.sqrt((getBeginX() - getEndX()) * (getBeginX() - getEndX())
				+ (getBeginY() - getEndY()) * (getBeginY() - getEndY()));
	}

	public double getGradient() {
		return Math.atan2(getBeginY() - getEndY(), getBeginX() - getEndX());
	}

	@Override
	public String toString() {
		return "Line [begin: " + "(" + getX() + ", " + getY() + ")" + ", end: " + end.toString()
				+ "]";
	}
}
