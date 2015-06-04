package com.bkav.training.week2.session9;

public class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime(int hour, int minute, int second) {
		if ((hour >= 0) && (hour <= 23) && (minute >= 0) && (minute <= 59)
				&& (second >= 0) && (second <= 59)) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		} else {
			System.out.println(" Thời gian khởi tạo không hợp lệ");
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if ((hour >= 0) && (hour <= 23)) {
			this.hour = hour;
		} else {
			System.out.println(" Giờ khởi tạo không hợp lệ");
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if ((minute >= 0) && (minute <= 59)) {
			this.minute = minute;
		} else {
			System.out.println(" Phút khởi tạo không hợp lệ");
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if ((second >= 0) && (second <= 59)) {
			this.second = second;
		} else {
			System.out.println(" Giây khởi tạo không hợp lệ");
		}
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

	public void nextMinute() {
		if (minute == 59) {
			if (hour == 23) {
				minute = 0;
				hour = 0;
			} else {
				minute = 0;
				hour++;
			}
		} else {
			minute++;
		}
		System.out.println(this);
	}

	public void previousMinute() {
		if (minute == 0) {
			if (hour == 0) {
				minute = 59;
				hour = 23;
			} else {
				minute = 59;
				hour--;
			}
		} else {
			minute--;
		}
		System.out.println(this);
	}

	public void nextHour() {
		if (hour == 23) {
			hour = 0;
		} else {
			hour++;
		}
		System.out.println(this);
	}

	public void previousHour() {
		if (hour == 0) {
			hour = 23;
		} else {
			hour--;
		}
		System.out.println(this);
	}

	public void nextSecond() {
		if (second == 59) {
			second = 0;
			if (minute == 59) {
				minute = 0;
				if (hour == 23) {
					hour = 0;
				} else {
					hour++;
				}
			} else {
				minute++;
			}
		} else {
			second++;
		}
		System.out.println(this);
	}

	public void previousSecond() {
		if (second == 0) {
			second = 59;
			if (minute == 0) {
				minute = 59;
				if (hour == 0) {
					hour = 23;
				} else {
					hour--;
				}
			} else {
				minute--;
			}
		} else {
			second--;
		}
		System.out.println(this);
	}
}
