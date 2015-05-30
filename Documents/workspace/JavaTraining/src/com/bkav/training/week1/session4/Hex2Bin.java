package com.bkav.training.week1.session4;

import java.util.Scanner;

public class Hex2Bin {
	private static Scanner in;

	public static void main(String[] args) {
		String hexa;
		int hexaLen;
		boolean check = true;
		char [] bitNumber;
		
		in = new Scanner(System.in);
	    System.out.print("Hãy nhập vào một số hexa ");
	    hexa = in.next().toLowerCase();
	    hexaLen =hexa.length();
	    bitNumber = new char[hexaLen];
	    // kiểm tra xem đây có phải số hexa không và lưu nó vào mảng
	    for (int i = 0; i <=hexaLen - 1; i++){
	     	if ((hexa.charAt(i) != '0') && (hexa.charAt(i) != '1') && (hexa.charAt(i) != '2') 
	     			&& (hexa.charAt(i) != '3') && (hexa.charAt(i) != '4') && (hexa.charAt(i) != '5') 
	     			&& (hexa.charAt(i) != '6') && (hexa.charAt(i) != '7') && (hexa.charAt(i) != '8') 
	     			&& (hexa.charAt(i) != '9') && (hexa.charAt(i) != 'a') && (hexa.charAt(i) != 'b') 
	     			&& (hexa.charAt(i) != 'c') && (hexa.charAt(i) != 'd') && (hexa.charAt(i) != 'e') 
	     			&& (hexa.charAt(i) != 'f')){
	     		check = false;
	    	} else {
	    		 bitNumber[i] = hexa.charAt(i);
	    	}
	    }
	    // hiển thị dưới dạng số bit
	    if (check == true) {
		    for (int i = 0; i <= hexaLen - 1; i++) {
		    	if (bitNumber[i] == '0') {
		    		System.out.print("0000 ");
		    	} else if (bitNumber[i] == '1') {
		    		System.out.print("0001 ");
		    	} else if (bitNumber[i] == '2') {
		    		System.out.print("0010 ");
		    	} else if (bitNumber[i] == '3') {
		    		System.out.print("0011 ");
		    	} else if (bitNumber[i] == '4') {
		    		System.out.print("0100 ");
		    	} else if (bitNumber[i] == '5') {
		    		System.out.print("0101 ");
		    	} else if (bitNumber[i] == '6') {
		    		System.out.print("0110 ");
		    	} else if (bitNumber[i] == '7') {
		    		System.out.print("0111 ");
		    	} else if (bitNumber[i] == '8') {
		    		System.out.print("1000 ");
		    	} else if (bitNumber[i] == '9') {
		    		System.out.print("1001 ");
		    	} else if (bitNumber[i] == 'a') {
		    		System.out.print("1010 ");
		    	} else if (bitNumber[i] == 'b') {
		    		System.out.print("1011 ");
		    	} else if (bitNumber[i] == 'c') {
		    		System.out.print("1100 ");
		    	} else if (bitNumber[i] == 'd') {
		    		System.out.print("1101 ");
		    	} else if (bitNumber[i] == 'e') {
		    		System.out.print("1110 ");
		    	} else if (bitNumber[i] == 'f') {
		    		System.out.print("1111 ");
		    	}
		    }
	    } else {
     		System.out.print(" Đây không phải là số hexa ");
	    }
	}
}
