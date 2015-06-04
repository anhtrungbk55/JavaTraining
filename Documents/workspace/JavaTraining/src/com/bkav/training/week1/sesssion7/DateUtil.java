package com.bkav.training.week1.sesssion7;

public class DateUtil {
	// tên các tháng để in ra màn hình
	public static String strMonths[] = { "Jan", "Feb", "Mar", "Apr", "May",
			"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	// Số các ngày trong tháng, trừ năm nhuận
	public static int daysInMonths[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30,
			31, 30, 31 };

	// hàm tính xem đây có phải năm nhuận hay không
	public static boolean isLeapYear(int year) {
		boolean check;
		if (year % 4 == 0) {
			check = true;
		} else {
			check = false;
		}
		return check;
	}

	// Return true if the given year, month, day is a valid date
	// year: 1-9999
	// month: 1(Jan)-12(Dec)
	// day: 1-28|29|30|31. The last day depends on year and month
	public static boolean isValidDate(int year, int month, int day) {
		boolean check = true;
		// kiểm tra năm
		if ((year < 1) || (year > 9999)) {
			check = false;
		}
		// kiểm tra tháng
		if ((month < 1) || (month > 12)) {
			check = false;
		}
		// Kiểm tra ngày
		if (((month == 1) || (month == 3) || (month == 5) || (month == 7)
				|| (month == 8) || (month == 10) || (month == 12))
				&& (day > 31)) {
			check = false;
		}
		if (((month == 4) || (month == 6) || (month == 9) || (month == 11))
				&& (day > 30)) {
			check = false;
		}
		if ((month == 2) && (isLeapYear(year)) && (day > 29)) {
			check = false;
		}
		if ((month == 2) && (!isLeapYear(year)) && (day > 28)) {
			check = false;
		}
		return check;
	}

	// Return the day of the week, 0:Sun, 1:Mon, ..., 6:Sat
	public static int getDayOfWeek(int year, int month, int day) {
		int num = 0;
		int dayName;

		if (year / 100 == 17) {
			num += 4;
		}
		if (year / 100 == 18) {
			num += 2;
		}
		if (year / 100 == 19) {
			num += 0;
		}
		if (year / 100 == 20) {
			num += 6;
		}
		if (year / 100 == 21) {
			num += 4;
		}
		if (year / 100 == 22) {
			num += 2;
		}
		if (year / 100 == 23) {
			num += 0;
		}
		if (year / 100 == 24) {
			num += 6;
		}
		int x = year % 100;
		num += x / 4;
		num += day + month;
		dayName = num % 7;
		return dayName;
	}

	// Return String "xxxday d mmm yyyy" (e.g., Wednesday 29 Feb 2012)
	public static String printDate(int year, int month, int day) {
		String date = ("Đây là ngày " + day + " tháng " + month + " năm " + year);
		return date;
	}

	public static void main(String[] args) {
		System.out.println(isLeapYear(1900)); // false
		System.out.println(isLeapYear(2000)); // true
		System.out.println(isLeapYear(2011)); // false
		System.out.println(isLeapYear(2012)); // true

		System.out.println(isValidDate(2012, 2, 29)); // true
		System.out.println(isValidDate(2011, 2, 29)); // false
		System.out.println(isValidDate(2099, 12, 31)); // true
		System.out.println(isValidDate(2099, 12, 32)); // true

		System.out.println(getDayOfWeek(1982, 4, 24)); // 6:Sat
		System.out.println(getDayOfWeek(2000, 1, 1)); // 6:Sat
		System.out.println(getDayOfWeek(2054, 6, 19)); // 5:Fri
		System.out.println(getDayOfWeek(2015, 6, 7)); // 5:Fri

		System.out.println(printDate(2012, 2, 14)); // Tuesday 14 Feb 2012
	}
}
