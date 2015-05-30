package com.bkav.training.week1.sesssion6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradesHistogram {
	public static int studentNum;
	public static int[] grades;
    // Declare an int array of grades, to be allocated later
	public static int[] bins = new int[10];
    // Declare and allocate an int array for histogram bins.
    // 10 bins for 0-9, 10-19,...., 90-100
	private static Scanner in;
 
	public static void main(String[] args) throws FileNotFoundException {
	    readGrades("grade");
	    computeHistogram();
	    printHistogramHorizontal();
	    printHistogramVertical();
	}
 
	// Read the grades from "filename", store in "grades" array.
	// Assume that the inputs are valid.
	public static void readGrades(String filename) throws FileNotFoundException {
		in = new Scanner(new File(filename));
		studentNum = in.nextInt();
		grades = new int[studentNum];
		for (int i = 0; i < studentNum; i++) {
			grades[i] = in.nextInt();
		}
	}
		 // Based on "grades" array, populate the "bins" array.
	public static void computeHistogram() {
		for (int i = 0; i < 10; i++) {
			bins[i] = 0;
			for (int j = 0; j < studentNum; j++){
				if ((i==0) && (grades[j] >= 0) && (grades[j] <= 9)) {
					bins[i]++;
				}
				if ((i==1) && (grades[j] >= 10) && (grades[j] <= 19)) {
					bins[i]++;
				}
				if ((i==2) && (grades[j] >= 20) && (grades[j] <= 29)) {
					bins[i]++;
				}
				if ((i==3) && (grades[j] >= 30) && (grades[j] <= 39)) {
					bins[i]++;
				}
				if ((i==4) && (grades[j] >= 40) && (grades[j] <= 49)) {
					bins[i]++;
				}
				if ((i==5) && (grades[j] >= 50) && (grades[j] <= 59)) {
					bins[i]++;
				}
				if ((i==6) && (grades[j] >= 60) && (grades[j] <= 69)) {
					bins[i]++;
				}
				if ((i==7) && (grades[j] >= 70) && (grades[j] <= 79)) {
					bins[i]++;
				}
				if ((i==8) && (grades[j] >= 80) && (grades[j] <= 89)) {
					bins[i]++;
				}
				if ((i==9) && (grades[j] >= 90) && (grades[j] <= 100)) {
					bins[i]++;
				}
			}
		}
	}
		 // Print histogram based on the "bins" array.
	public static void printHistogramHorizontal() { 
		for (int i = 0; i < 10; i++) {
			System.out.print(bins[i] + "  ");
		}
	}
		 // Print histogram based on the "bins" array.
	public static void printHistogramVertical() {
		System.out.println("");
		System.out.print("0  - 9  :");
		for (int i = 0; i < bins[0]; i++){
			System.out.print("* ");
		}
		System.out.println("");
		System.out.print("10 - 19 :");
		for (int i = 0; i < bins[1]; i++){
			System.out.print("* ");
		}
		System.out.println("");
		System.out.print("20 - 29 :");
		for (int i = 0; i < bins[2]; i++){
			System.out.print("* ");
		}
		System.out.println("");
		System.out.print("30 - 39 :");
		for (int i = 0; i < bins[3]; i++){
			System.out.print("* ");
		}
		System.out.println("");
		System.out.print("40 - 49 :");
		for (int i = 0; i < bins[4]; i++){
			System.out.print("* ");
		}
		System.out.println("");
		System.out.print("50 - 59 :");
		for (int i = 0; i < bins[5]; i++){
			System.out.print("* ");
		}
		System.out.println("");
		System.out.print("60 - 69 :");
		for (int i = 0; i < bins[6]; i++){
			System.out.print("* ");
		}
		System.out.println("");
		System.out.print("70 - 79 :");
		for (int i = 0; i < bins[7]; i++){
			System.out.print("* ");
		}
		System.out.println("");
		System.out.print("80 - 89 :");
		for (int i = 0; i < bins[8]; i++){
			System.out.print("* ");
		}
		System.out.println("");
		System.out.print("90 -100 :");
		for (int i = 0; i < bins[9]; i++){
			System.out.print("* ");
		}

	}
}
