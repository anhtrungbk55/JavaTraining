package com.bkav.training.week1.session3;

import java.util.Scanner;

public class Bin2Dec {
	   private static Scanner in;

	public static void main(String[] args) {
		   String binStr;    // input binary string
		   int binStrLen;    // length of the input string
		   int dec = 0;      // equivalent decimal number
		   boolean check = true;
		    
		   in = new Scanner(System.in);
		   System.out.print(" Hãy nhập xâu bit");
		   binStr = in.next();
		   binStrLen = binStr.length();
		      // kiểm tra xem có phải chuỗi bit không
		   for (int i = 0; i <= (binStrLen - 1); i++){
			   if ((binStr.charAt(i) != '0') && (binStr.charAt(i) != '1')){
				   check = false;
			   }
		   }
		   if (check == false) {
			   System.out.print("Đây không phải là chuỗi bit");
		   } else {
			   for (int i = 0; i <= (binStrLen - 1); i++) {
				   // chuyển từng chữ số sang dạng int
				   int conv2Int = Integer.parseInt(Character.toString(binStr.charAt(i)));  
				   // chuyển sang số Dexima
				   dec += (conv2Int * (Math.pow(2, binStrLen - 1 - i))); 
			   }
			   System.out.print("Số sau khi đã chuyển sang hệ Dexima là: " + dec);
		   }
	  }
}
