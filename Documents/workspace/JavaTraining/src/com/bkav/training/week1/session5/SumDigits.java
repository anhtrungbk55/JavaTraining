package com.bkav.training.week1.session5;

public class SumDigits {
	public static void main (String[] args) {
		String digits;
		int digitsLen;
		int sum = 0;
		
		// kiểm tra xem câu comment có đúng cú pháp ko
	    if (args.length != 1) {
		      System.err.println("Phải nhập đúng : java Arithmetic String");
		      return;
		}
	    digits = args[0];
	    digitsLen = digits.length();
	    for (int i = 0; i < digitsLen; i++){
	    	if (digits.charAt(i) == '1') {
	    		sum += 1;
	    		System.out.print(digits.charAt(i) + "+");
	    	} else if (digits.charAt(i) == '2') {
	    		sum += 2;
	    		System.out.print(digits.charAt(i) + "+");
	    	} else if (digits.charAt(i) == '3') {
	    		sum += 3;
	    		System.out.print(digits.charAt(i) + "+");
	    	} else if (digits.charAt(i) == '4') {
	    		sum += 4;
	    		System.out.print(digits.charAt(i) + "+");
	    	} else if (digits.charAt(i) == '5') {
	    		sum += 5;
	    		System.out.print(digits.charAt(i) + "+");
	    	} else if (digits.charAt(i) == '6') {
	    		sum += 6;
	    		System.out.print(digits.charAt(i) + "+");
	    	} else if (digits.charAt(i) == '7') {
	    		sum += 7;
	    		System.out.print(digits.charAt(i) + "+");
	    	} else if (digits.charAt(i) == '8') {
	    		sum += 8;
	    		System.out.print(digits.charAt(i) + "+");
	    	} else if (digits.charAt(i) == '9') {
	    		sum += 9;
	    		System.out.print(digits.charAt(i) + "+");
	    	}
	    }
	    System.out.print(" = " + sum);
	}
	
}
