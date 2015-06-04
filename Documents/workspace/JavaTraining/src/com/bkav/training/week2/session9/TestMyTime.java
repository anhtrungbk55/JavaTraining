package com.bkav.training.week2.session9;

public class TestMyTime {
	public static void main(String[] args) {
		MyTime time1 = new MyTime(12, 89, 32);
		MyTime time2 = new MyTime(2, 50, 50);
		MyTime time3 = new MyTime(2, 59, 59);
		MyTime time4 = new MyTime(23, 59, 59);
		MyTime time5 = new MyTime(2, 59, 50);
		MyTime time6 = new MyTime(23, 5, 59);
		MyTime time7 = new MyTime(23, 59, 59);
		MyTime time8 = new MyTime(00, 00, 00);
		MyTime time9 = new MyTime(00, 00, 59);
		
		System.out.println(time2);
		time1.nextHour();
		time2.nextHour();
		time3.nextMinute();
		time8.previousSecond();
		time9.previousSecond();
		time7.nextSecond();
		time6.nextHour();
		time5.nextMinute();
		time4.nextMinute();
	}
}
