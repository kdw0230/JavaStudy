package ch06;

import java.util.Scanner;

public class Exam6_3_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���Ը� �Է��ϼ���. >> ");
		int num = s.nextInt();
		
//		String rr = checkGrade(num);
//		System.out.println(rr);
		
		System.out.println(checkGrade(num));
		s.close();
		
//		checkGrade(5);
//		checkGrade(11);
//		checkGrade(8);
//		checkGrade(4);
	}
	public static String checkGrade (int weight) {
		String grade = "";
		if (weight > 10) {
			grade = "1���";
		}else if (weight > 7){
			grade = "2���";
		}else if (weight > 4){
			grade = "3���";
		}else {
			grade = "4���";
		}
		return grade;
	}

//	public static int checkGrade(int num) {
//		if (num > 10) {
//			System.out.println("1���");
//		} else if (num > 7) {
//			System.out.println("2���");
//		} else if (num > 4) {
//			System.out.println("3���");
//		} else {
//			System.out.println("4���");
//		}
//		return num;
//	}
	
}
