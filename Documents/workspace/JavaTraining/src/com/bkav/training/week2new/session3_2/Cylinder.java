package com.bkav.training.week2new.session3_2;

import com.bkav.training.week2.session1.Circle;


public class Cylinder {
	private double height;
	private Circle circle;
	
	public Cylinder() {
	      circle = new Circle(); // Call the constructor to construct the Circle
	      height = 1.0; 
	   }
	public Cylinder(double height, Circle circle) {
		this.height = height;
		this.circle = circle;
	}
	
	public Cylinder(double radius, double height) {
		circle = new Circle(radius); // call superclass constructor Circle(r)
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}

	// A public method for computing the volume of cylinder
	// use superclass method getArea() to get the base area
	public double getVolume() {
		return circle.getArea() * height;
	}
	
	public double getArea() {
		return 2 * Math.PI * circle.getRadius() * height + 2 * circle.getArea();
	}
	
	public String toString() {      // in Cylinder class
		   return "Cylinder: subclass of " + circle.toString()  // use Circle's toString()
		          + " height=" + height;
		}
}
