package com.bkav.training.week2.session10;

public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate(int year, int month, int day) {
		if (isValidDate(year, month, day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		} else {
			System.out.println("Ngày khởi tạo không hợp lệ");
		}
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	// Hàm kiểm tra xem đây có phải là ngày hợp lệ không
	public boolean isValidDate(int year, int month, int day) {
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

	// hàm kiểm tra xem đây có phải năm nhuận hay không
	public boolean isLeapYear(int year) {
		boolean check;
		if (year % 4 == 0) {
			check = true;
		} else {
			check = false;
		}
		return check;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}

	public String getDayOfWeek() {
		int num = 0;
		int dayName;
		String[] result = {"Chủ nhật", "Thứ 2", "Thứ 3", "Thứ 4",
				"Thứ 5", "Thứ 6", "Thứ 7", };

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
		if ((month == 1) && !isLeapYear(year)) {
			num += 0;
		}
		if ((month == 1) && isLeapYear(year)) {
			num += 6;
		}
		if ((month == 2) && !isLeapYear(year)) {
			num += 3;
		}
		if ((month == 2) && isLeapYear(year)) {
			num += 2;
		}
		if (month == 3) {
			num += 3;
		}
		if (month == 4) {
			num += 6;
		}
		if (month == 5) {
			num += 1;
		}
		if (month == 6) {
			num += 4;
		}
		if (month == 7) {
			num += 6;
		}
		if (month == 8) {
			num += 2;
		}
		if (month == 9) {
			num += 5;
		}
		if (month == 10) {
			num += 0;
		}
		if (month == 11) {
			num += 3;
		}
		if (month == 12) {
			num += 5;
		}
		int x = year % 100;
		num += x + x / 4;
		num += day;
		dayName = num % 7;
		return result[dayName];
	}
}
