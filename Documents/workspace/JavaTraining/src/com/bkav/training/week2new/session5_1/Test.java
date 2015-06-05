package com.bkav.training.week2new.session5_1;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Customer cus1 = new Customer("Bùi Viết Trung");
		System.out.println(cus1);
		Customer cus2 = new Customer("Trịnh Công Nam");

		cus2.setMember(true);
		cus2.setMemberType("Gold");
		System.out.println(cus2);

		Date date = new Date();
		Visit vis1 = new Visit(cus1, date);
		Visit vis2 = new Visit(cus2, date);
		System.out.println(vis1);
		System.out.println(vis1.getTotalExpense());
		System.out.println(vis2.getTotalExpense());
	}
}
