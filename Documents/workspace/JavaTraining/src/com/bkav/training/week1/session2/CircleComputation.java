package com.bkav.training.week1.session2;

import java.util.Scanner;

public class CircleComputation {
	private static Scanner in;

	public static void main(String[] args) {
	    double radius;
	    
	    in = new Scanner(System.in);
	    System.out.print("hãy nhập bán kính đường tròn ");
	    radius = in.nextDouble();  // use nextDouble() to read double
	    System.out.print("chu vi đường tròn là: " + (2 * radius * Math.PI));
	    System.out.print("diện tích hình tròn là: " + (radius * Math.PI * Math.PI));
	    
	}
}
