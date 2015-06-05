package com.bkav.training.week2new.session3_1;

public class Line {
	// A line composes of two points (as instance variables)
	private Point begin; // beginning point
	private Point end; // ending point

	// Constructors
	public Line(Point begin, Point end) { // caller to construct the Points
		this.begin = begin;
		this.end = end;
	}

	public Line(int beginX, int beginY, int endX, int endY) {
		begin = new Point(beginX, beginY); // construct the Points here
		end = new Point(endX, endY);
	}

	public Point getBegin() {
		return begin;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public int getBeginX() {
		return begin.getX();
	}

	public int getBeginY() {
		return begin.getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public void setBeginX(int beginX) {
		begin.setX(beginX);
	}

	public void setBeginY(int beginY) {
		begin.setY(beginY);
	}

	public void setBeginXY(int beginX, int beginY) {
		begin.setX(beginX);
		begin.setY(beginY);
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
		return "Line [begin: " + begin.toString() + ", end: " + end.toString()
				+ "]";
	}
}
