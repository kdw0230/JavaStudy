package Test;

import java.util.Calendar;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. >> ");
		int year = s.nextInt();
		System.out.print("���� �Է��ϼ���. >> ");
		int month = s.nextInt();
		System.out.print("���� �Է��ϼ���. >> ");
		int day = s.nextInt();

		System.out.println(year + "�� " + month + "���� " + getLastYear(year, month) + "�ϱ��� �Դϴ�.");
		System.out.println(year + "�� " + month + "�� " + day + "���� " + dayOfWeek(year, month, day) + "�Դϴ�.");

		s.close();
	}

	public static String dayOfWeek(int year, int month, int date) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, date);
		String dayOfWeek = "";

		int week = cal.get(Calendar.DAY_OF_WEEK);
		if (week == 1) {
			dayOfWeek = "�Ͽ���";
		} else if (week == 2) {
			dayOfWeek = "������";
		} else if (week == 3) {
			dayOfWeek = "ȭ����";
		} else if (week == 4) {
			dayOfWeek = "������";
		} else if (week == 5) {
			dayOfWeek = "�����";
		} else if (week == 6) {
			dayOfWeek = "�ݿ���";
		} else {
			dayOfWeek = "�����";
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
