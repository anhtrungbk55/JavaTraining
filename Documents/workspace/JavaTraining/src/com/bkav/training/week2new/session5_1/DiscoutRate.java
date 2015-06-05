package com.bkav.training.week2new.session5_1;

public class DiscoutRate {
	private double serviceDiscountPremium = 0.2;
	private double serviceDiscountGold = 0.15;
	private double serviceDiscountSilver = 0.1;
	private double productDiscount = 0.1;

	public double getServiceDiscountRate(String type) {
		if (type.equals("Premium")) {
			return serviceDiscountPremium;
		} else if (type.equals("Gold")) {
			return serviceDiscountGold;
		} else {
			return serviceDiscountSilver;
		}
	}

	public double getProductDiscountRate(String type) {
		return productDiscount;
	}
}
