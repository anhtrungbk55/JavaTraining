package com.bkav.training.week2.session7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyPolynomial {
	private double[] coeffs;
	
	// Khởi tạo theo tham số tryền vào
	public MyPolynomial(double... coeffs) { // varargs
		this.coeffs = coeffs; // varargs is treated as array
	}

	// Khởi tạo bằng 1 file cho trước
	public MyPolynomial(String filename) {
		Scanner in = null;
		try {
			in = new Scanner(new File(filename)); // open file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int degree = in.nextInt(); // read the degree
		coeffs = new double[degree + 1]; // allocate the array
		for (int i = 0; i < coeffs.length; ++i) {
			coeffs[i] = in.nextDouble();
		}
	}
	
	public int getDegree() {
		return this.coeffs.length - 1;
	}

	@Override
	public String toString() {
		String result = "";
		for (int i = this.coeffs.length - 1; i > 0; i--) {
			result += this.coeffs[i] + "x^" + i + " + ";
		}
		result += this.coeffs[0];
		return result;
	}
	
	public double evaluate(double x) {
		double sum = 0;
		for (int i = 0; i <= this.coeffs.length - 1; i++) {
			sum += this.coeffs[i] * Math.pow(x, i);
		}
		return sum;
	}
	public MyPolynomial add(MyPolynomial otherPo) {
		MyPolynomial result = null;
		double[] swap;
		
		if (otherPo.coeffs.length >= this.coeffs.length) {
			swap = new double [otherPo.coeffs.length];
			for (int i = 0; i <= this.coeffs.length - 1; i++) {
				swap[i] = otherPo.coeffs[i] + this.coeffs[i];
			}
			for (int i = this.coeffs.length; i <= otherPo.coeffs.length - 1; i++) {
				swap[i] = otherPo.coeffs[i];
			}
			result = new MyPolynomial(swap);
		}
		if (otherPo.coeffs.length < this.coeffs.length) {
			swap = new double [this.coeffs.length];
			for (int i = 0; i <= otherPo.coeffs.length - 1; i++) {
				swap[i] = otherPo.coeffs[i] + this.coeffs[i];
			}
			for (int i = otherPo.coeffs.length; i <= this.coeffs.length - 1; i++) {
				swap[i] = this.coeffs[i];
			}
			result = new MyPolynomial(swap);
		}
		return result;
	}
	
	public MyPolynomial multi(MyPolynomial otherPo) {
		MyPolynomial result = null;
		
		// Tạo mảng để lưu các tham số của đối tượng result
		double[] swap = new double[otherPo.coeffs.length + this.coeffs.length - 1];
		
		// Khởi tạo mảng về giá trị 0 hết
		for (int i = 0; i < swap.length; i++) {
			swap[i] = 0;
		}
		
		// Nhân 2 đa thức
		for (int i = 0; i < this.coeffs.length; i++) {
			for (int j = 0; j < otherPo.coeffs.length; j++) {
				swap[i + j] += this.coeffs[i] * otherPo.coeffs[j];
			}
		}
		
		result = new MyPolynomial(swap);
		return result;
	}
}
