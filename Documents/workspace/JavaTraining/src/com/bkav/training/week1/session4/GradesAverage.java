package com.bkav.training.week1.session4;

import java.util.Scanner;

public class GradesAverage {
private static Scanner in;
	
	public static void main(String[] args) {
		int studentsNum;
		int[] studentGrade;
		int sum = 0;
		
		in = new Scanner(System.in);
	    System.out.print("Hãy nhập vào số sinh viên ");
	    studentsNum = in.nextInt();
	    studentGrade = new int[studentsNum];
	    for (int i =0; i <= studentsNum - 1; i++){
	    	System.out.print("Hãy nhập vào điểm của sinh viên " + (i + 1) + "  ");
	    	studentGrade[i] = in.nextInt();
	    	while ((studentGrade[i] <= 0) || (studentGrade[i] >= 100)){
	    		System.out.print("Điểm sinh viên phải >= 0 và <=100, hãy nhập lại");
	    		studentGrade[i] = in.nextInt();
	    	}
	    	sum += studentGrade[i];
	    }
	    System.out.print("Điểm trung bình của các sinh viên là: " + (sum / studentsNum));
	}
}
