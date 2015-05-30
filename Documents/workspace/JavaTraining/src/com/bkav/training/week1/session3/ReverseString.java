package com.bkav.training.week1.session3;

import java.util.Scanner;

public class ReverseString {
	private static Scanner in;

	public static void main(String[] args) {
	      String inStr;        // chỗi nhập v
	      int inStrLen;        // độ dài xâu string
	   
	      in = new Scanner(System.in);
	      System.out.print("Nhập vào một chuỗi: ");
	      inStr = in.next();   // read String
	      inStrLen = inStr.length();
	      for (int i = inStrLen - 1; i >= 0; i--){
	    	  System.out.print(inStr.charAt(i)); //inStr.charAt(i) để lấy kí tự thứ i của xâu inStr
	      }
	   }
}
