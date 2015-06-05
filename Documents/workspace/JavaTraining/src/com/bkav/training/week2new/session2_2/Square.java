package com.bkav.training.week2new.session2_2;

public class Square extends Rectangle {

	public Square(double side) {
		super(side, side);
	}

	public void setLength(double length) {
		this.setLength(length);
		this.setWidth(length);
	}

	public void setWidth(double width) {
		this.setLength(width);
		this.setWidth(width);
	}

	@Override
	public String toString() {
		return "A Square with side=" + this.getLength() + ", which is a subclass of " + super.toString();
	}
}
