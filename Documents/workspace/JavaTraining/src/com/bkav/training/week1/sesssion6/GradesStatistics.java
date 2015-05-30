package com.bkav.training.week1.sesssion6;

import java.util.Scanner;

public class GradesStatistics {
private static Scanner in;
	
	public static void main(String[] args) {
		int studentsNum;
		int[] studentGrade;
		
		in = new Scanner(System.in);
	    System.out.print("Hãy nhập vào số sinh viên ");
	    studentsNum = in.nextInt();
	    studentGrade = new int[studentsNum];
	    // nhập điểm của từng sinh viên và lưu vào mảng studentGrade
	    for (int i =0; i <= studentsNum - 1; i++){
	    	System.out.print("Hãy nhập vào điểm của sinh viên " + (i + 1) + "  ");
	    	studentGrade[i] = in.nextInt();
	    	while ((studentGrade[i] <= 0) || (studentGrade[i] >= 100)){
	    		System.out.print("Điểm sinh viên phải >= 0 và <=100, hãy nhập lại");
	    		studentGrade[i] = in.nextInt();
	    	}
	     }
	     System.out.println("The average is " + average(studentGrade,studentsNum));
	     System.out.println("The minimum is " + minimum(studentGrade,studentsNum));
	     System.out.println("The maximum is " + maximum(studentGrade,studentsNum));
	}
	public static int maximum(int[] grade, int leng ){
		int max = 0;
		for (int i =0; i <= leng - 1; i++){
			if ( grade[i] >= max){
				max = grade[i];
			}
		}
		return max;
	}
	public static int minimum(int[] grade, int leng ){
		int min = grade[1];
		for (int i =0; i <= leng - 1; i++){
			if ( grade[i] <= min){
				min = grade[i];
			}
		}
		return min;
	}
	public static double average(int[] grade, int leng ){
		int sum = 0;
		for (int i =0; i <= leng - 1; i++){
			sum += grade[i];
		}
		double aver = (double) sum / (double) leng;
		return aver;
	}
}
