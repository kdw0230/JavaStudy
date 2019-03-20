package Test;

import java.util.Calendar;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("연도를 입력하세요. >> ");
		int year = s.nextInt();
		System.out.print("월을 입력하세요. >> ");
		int month = s.nextInt();
		System.out.print("일을 입력하세요. >> ");
		int day = s.nextInt();

		System.out.println(year + "년 " + month + "월은 " + getLastYear(year, month) + "일까지 입니다.");
		System.out.println(year + "년 " + month + "월 " + day + "일은 " + dayOfWeek(year, month, day) + "입니다.");

		s.close();
	}

	public static String dayOfWeek(int year, int month, int date) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, date);
		String dayOfWeek = "";

		int week = cal.get(Calendar.DAY_OF_WEEK);
		if (week == 1) {
			dayOfWeek = "일요일";
		} else if (week == 2) {
			dayOfWeek = "월요일";
		} else if (week == 3) {
			dayOfWeek = "화요일";
		} else if (week == 4) {
			dayOfWeek = "수요일";
		} else if (week == 5) {
			dayOfWeek = "목요일";
		} else if (week == 6) {
			dayOfWeek = "금요일";
		} else {
			dayOfWeek = "토요일";
		}
		return dayOfWeek;
	}

	public static int getLastYear(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		return lastDate;
	}
}
