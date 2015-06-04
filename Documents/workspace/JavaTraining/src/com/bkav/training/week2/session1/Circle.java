package com.bkav.training.week2.session1;

public class Circle {
    // private instance variable, not accessible from outside this class
	private double radius;
	private String color;
	   
	 // 1st constructor, which sets both radius and color to default
	public Circle() {
	   radius = 1.0;
	   setColor("red");
	}
	   
	// 2nd constructor with given radius, but color default
	public Circle(double r) {
	   radius = r;
	   setColor("red");
	}
	   
	// 3th constructor
	public Circle (double r, String c) {
		radius = r;
		setColor(c);
	}
	   
	// A public method for retrieving the radius
	public double getRadius() {
	    return radius; 
	}
	   
	 // A public method for computing the area of circle
	public double getArea() {
	    return radius*radius*Math.PI;
	}

	public String getColor() {
		return color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		   return "Circle: radius=" + radius + " color=" + color;
		}
}
