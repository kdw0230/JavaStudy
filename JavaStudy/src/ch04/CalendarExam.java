package ch04;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		// 달력기능(라이브러리 )사용
		Calendar cal = Calendar.getInstance();
		int date = cal.get(Calendar.DATE);
		// 달력의 날자를 지정
		cal.set(2019, 2, 1);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		// 달력의 요일 제목 출력
		System.out.println("      "+year + "년 " + month + "월");
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("====================");
		// 매월 1일의 시작 요일 맞춰주기(여백)
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.print("   ");
		}
		// 실제 날짜 출력하기
		for (int i = 1; i <= lastDate; i++) {
			if (i < 10) {
				System.out.print("0" + i + " ");
			} else {
				System.out.print(i + " ");
			}
			if (dayOfWeek % 7 == 0) {
				System.out.println();
			}
			dayOfWeek++;
		}
//		System.out.println(year + "년");
//		System.out.println(month + "월");
//		// 1월=>0,2월=>1....12월=>11
//		System.out.println(date + "일");
//		System.out.println(dayOfWeek);
//		System.out.println(lastDate);
	}
}
