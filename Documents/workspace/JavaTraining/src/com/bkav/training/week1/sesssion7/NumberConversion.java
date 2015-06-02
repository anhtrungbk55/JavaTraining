package com.bkav.training.week1.sesssion7;

public class NumberConversion {
	// chuyển từ hệ cơ số 2 sang hệ cơ số 10
	public static void bin2Dec(String num) {
		int strLeng = num.length();
		boolean check = true;
		int conv2Int;
		int dec = 0;
		
		   // kiểm tra xem có phải chuỗi bit không
		   for (int i = 0; i <= (strLeng - 1); i++){
			   if ((num.charAt(i) != '0') && (num.charAt(i) != '1')){
				   check = false;
			   }
		   }
		   if (check == false) {
			   System.out.print("Đây không phải là chuỗi bit");
		   } else {
			   for (int i = 0; i <= (strLeng - 1); i++) {
				   // chuyển từng chữ số sang dạng int
				   conv2Int = Integer.parseInt(Character.toString(num.charAt(i)));  
				   // chuyển sang số Dexima
				   dec += (conv2Int * (Math.pow(2, strLeng - 1 - i))); 
			   }
			   System.out.print("Số sau khi đã chuyển sang hệ Dexima là: " + dec);
		   }
	}
	// chuyển từ hệ cơ số 2 sang hệ cơ số 16
	public static void bin2Hex(String num) {
		int strLeng = num.length();
		boolean check = true;
		
		   // kiểm tra xem có phải chuỗi bit không
		   for (int i = 0; i <= (strLeng - 1); i++){
			   if ((num.charAt(i) != '0') && (num.charAt(i) != '1')){
				   check = false;
			   }
		   }
		   if (check == false) {
			   System.out.print("Đây không phải là chuỗi bit");
		   } else {
			   for(int i = (strLeng - 1); i >=0; i = i - 4) {
				   if (i == 2) {
					   
				   }
			   }
		   }
	}
	// chuyển từ hệ cơ số 10 sang hệ cơ số 2
	public static void dec2Bin(String num) {
		
	}
	// chuyển từ hệ cơ số 10 sang hệ cơ số 16
	public static void dec2Hex(String num) {
		
	}
	// chuyển từ hệ cơ số 16 sang hệ cơ số 2
	public static void hex2Bin(String num) {
		
	}
	// chuyển từ hệ cơ số 16 sang hệ cơ số 10
	public static void hex2Dec(String num) {
		
	}
}
