package com.bkav.training.week2new.session4_4;

public class ResizableCircle extends Circle implements Resizable{

	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public void resize(int percent) {
		this.radius = this.radius * (1 + (double) percent / 100);
	}
}
