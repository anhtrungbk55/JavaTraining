package com.bkav.training.week1.sesssion6;

public class reverseArray {
	public static void main(String[] args) {
		int[] A = {12, 22, 32, 54, 54, 65};
		reverse(A);
	}
	public static void reverse(int[] A){
		for (int i = 0; i < (A.length / 2); i++){
			int swap;
			swap = A[i];
			A[i] = A[A.length - i -1];
			A[A.length - i -1] = swap;
		}
		System.out.print("Mảng nghịch đảo của A là: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
}
