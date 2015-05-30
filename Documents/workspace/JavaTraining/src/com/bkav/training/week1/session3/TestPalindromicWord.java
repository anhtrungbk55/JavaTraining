package com.bkav.training.week1.session3;

import java.util.Scanner;

public class TestPalindromicWord {
	private static Scanner in;
	
	public static void main(String[] args) {
		String key;
		int keyLen;
		boolean check = true;
		
		in = new Scanner(System.in);
	    System.out.print("Hãy nhập vào một xâu: ");
	    key = in.next().toLowerCase(); // chuyển những kí tự hoa thành kí tự thưòng để nhận dạng
	    keyLen = key.length();
	    for (int i = 0 ; i <= (keyLen - 1); i++){
	    	if (key.charAt(i) != key.charAt(keyLen - i - 1)){
	    		check = false;
	    	}
	    }
	    if (check == true){
	    	System.out.print("Đây là một từ Palindomic");
	    } else {
	    	System.out.print("Đây không phải từ Palindomic");
	    }
	}
}
