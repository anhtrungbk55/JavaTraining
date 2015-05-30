package com.bkav.training.week1.session2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
	private static Scanner in;

	public static void main(String[] args) throws FileNotFoundException{
		int num1;
	    double num2;
	    String name;
	    
	    in = new Scanner(new File("in"));
	    num1 = in.nextInt();      // use nextInt() to read int
	    num2 = in.nextDouble();   // use nextDouble() to read double
	    name = in.next();         // use next() to read String
	    System.out.print("Hi " + name + ", the sum of " + num1 + " and " + num2 + " is " + (num1 + num2));

	}
}
