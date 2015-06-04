package com.bkav.training.week2.session10;

public class TestMyDate {
	public static void main(String[] args) {
		//MyDate date1 = new MyDate(2000, 23, 12);
		MyDate date2 = new MyDate(2015, 6, 4);
		MyDate date3 = new MyDate(2016, 5, 5);
		System.out.println(date2);
		System.out.println(date3);
		System.out.println(date3.getDayOfWeek());
	}
}
