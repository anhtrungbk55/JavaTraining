package com.bkav.training.week1.sesssion7;

import java.util.Scanner;

public class WordGuess {
	private static Scanner in;
	public static void main (String[] args) {
		String secretStr = "testing";
		int cout = 0;
		String guessStr;
		int strLeng = secretStr.length();
		boolean[] check = new boolean[strLeng];
		
		// khởi tạo mảng check
		for (int i = 0; i < strLeng; i++) {
			check[i] = false;
		}
		in = new Scanner(System.in);
		System.out.print("Hãy nhập vào chữ cái dự đoán :");
		guessStr = in.next();
		// vòng lặp nhập các chữ cái dự đoán cho tới khi đúng
		while(checkTrue(check) == false){
			cout++;
			for (int i = 0; i < strLeng; i++) {
				char[] arrChar = {secretStr.charAt(i)}; //chuyển dạng char sang String
				String objStr = new String(arrChar);    // chuyển dạng char sang String
				if (guessStr.equals(objStr)){
					check[i] = true;
				}
			}
			for (int i = 0; i < strLeng; i++) {
				if (check[i] == true) {
					System.out.print(secretStr.charAt(i));
				} else {
					System.out.print("_");
				}
			}
			System.out.println("");
			System.out.print(" Hãy nhập tiếp");
			guessStr = in.next();
		}
		System.out.print("Bạn đã đoán đúng chuỗi là :" + secretStr);
		System.out.print("số lần đoán của bạn là :" + cout);
	}
	// kiểm tra xem đúng hết chuỗi chưa
	public static boolean checkTrue (boolean[] check) {
		boolean result = true;
		for (int i = 0; i < check.length; i++) {
			if (check[i] == false) {
				result = false;
			}
		}
		return result;
	}
}
