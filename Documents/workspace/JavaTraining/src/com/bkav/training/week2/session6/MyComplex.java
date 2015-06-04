package com.bkav.training.week2.session6;

public class MyComplex {
	private double real;
	private double imag;

	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	@Override
	public String toString() {
		return "(" + real + " + " + imag + "i)";
	}

	public boolean isReal() {
		return (imag == 0);
	}

	public boolean isImagine() {
		return (imag != 0);
	}

	public boolean equals(double real, double imag) {
		return ((real == this.real) && (imag == this.imag));
	}

	public boolean equals(MyComplex otherCom) {
		return ((otherCom.real == this.real) && (otherCom.imag == this.imag));
	}

	public double magnitude() {
		return Math.sqrt(this.imag * this.imag + this.real * this.real);
	}

	public double argumentInRadians() {
		return Math.atan2(this.imag, this.real);
	}

	public double argumentInDegrees() {
		return Math.atan2(this.imag, this.real) * 180 / Math.PI;
	}

	public MyComplex conjugate() {
		return new MyComplex(this.real, -this.imag);
	}

	public MyComplex add(MyComplex otherCom) {
		return new MyComplex(real + otherCom.real, imag + otherCom.imag);
	}

	public MyComplex subtract(MyComplex otherCom) {
		return new MyComplex(real - otherCom.real, imag - otherCom.imag);
	}

	public MyComplex multiplyWith(MyComplex otherCom) {
		return new MyComplex(real * otherCom.real - imag * otherCom.imag, real
				* otherCom.imag + otherCom.real + imag);
	}

	public MyComplex devideBy(MyComplex otheCom) {
		MyComplex swap = this.multiplyWith(otheCom.conjugate());
		return new MyComplex(swap.real
				/ (otheCom.real * otheCom.real + otheCom.imag * otheCom.imag),
				swap.imag
						/ (otheCom.real * otheCom.real + otheCom.imag
								* otheCom.imag));
	}
}
