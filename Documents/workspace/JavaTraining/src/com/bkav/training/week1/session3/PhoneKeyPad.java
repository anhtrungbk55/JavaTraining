package com.bkav.training.week1.session3;

import java.util.Scanner;

public class PhoneKeyPad {
	private static Scanner in;
	
	public static void main(String[] args) {
		String key;
		int keyLen;
		
		in = new Scanner(System.in);
	    System.out.print("Hãy nhập vào một xâu: ");
	    key = in.next().toLowerCase(); // chuyển những kí tự hoa thành kí tự thưòng để nhận dạng
	    keyLen = key.length();
	    System.out.print("Xâu chữ số tương ứng là: ");
	    for (int i = 0; i <= keyLen - 1; i++) {
	    	if ((key.charAt(i) == 'a') || (key.charAt(i) == 'b') || (key.charAt(i) == 'c')) {
	    		System.out.print("2");
	    	}
	    	else if ((key.charAt(i) == 'd') || (key.charAt(i) == 'e') || (key.charAt(i) == 'f')){
	    		System.out.print("3");
	    	}
	    	else if ((key.charAt(i) == 'g') || (key.charAt(i) == 'h') || (key.charAt(i) == 'i')){
	    		System.out.print("4");
	    	}
	    	else if ((key.charAt(i) == 'j') || (key.charAt(i) == 'k') || (key.charAt(i) == 'l')){
	    		System.out.print("5");
	    	}
	    	else if ((key.charAt(i) == 'm') || (key.charAt(i) == 'n') || (key.charAt(i) == 'o')){
	    		System.out.print("6");
	    	}
	    	else if ((key.charAt(i) == 'p') || (key.charAt(i) == 'q') || (key.charAt(i) == 'r') || (key.charAt(i) == 's')){
	    		System.out.print("7");
	    	}
	    	else if ((key.charAt(i) == 't') || (key.charAt(i) == 'u') || (key.charAt(i) == 'v')){
	    		System.out.print("8");
	    	}
	    	else if ((key.charAt(i) == 'w') || (key.charAt(i) == 'x') || (key.charAt(i) == 'y') || (key.charAt(i) == 'z')){
	    		System.out.print("9");
	    	}
	    }
	}
}
