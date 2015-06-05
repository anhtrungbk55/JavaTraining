package com.bkav.training.week2new.session5_1;

import java.util.Date;

public class Visit extends DiscoutRate {
	private Customer customer;
	private Date date;
	private double serviceExpense = 100000;
	private double productExpense = 100000;

	public Visit(Customer customer, Date date) {
		this.customer = customer;
		this.date = date;
	}

	// Tiền dịch vụ phải trả đã triết khấu
	public double getServiceExpense() {
		if (customer.isMember()) {
			return serviceExpense
					* (1 - getServiceDiscountRate(customer.getMemberType()));
		} else {
			return serviceExpense;
		}
	}

	@Override
	public String toString() {
		return "Khách hàng " + getName() + " du lịch ngày " + date;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	// Tiền sản phẩm phải trả đã triết khấu
	public double getProductExpense() {
		if (customer.isMember()) {
			return productExpense
					* (1 - getProductDiscountRate(customer.getMemberType()));
		} else {
			return productExpense;
		}
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}

	public String getName() {
		return customer.getName();
	}

	// Tổng tiền phải trả đã triết khấu
	public double getTotalExpense() {
		return getProductExpense() + getProductExpense();
	}
}
