package ch06;

import java.util.Scanner;

public class Exam6_3_2 {
	public static void main(String[] args) {
//		getBetweenSum(3, 5);
//		getBetweenSum(7, 7);
//		getBetweenSum(5, 3);
//		getBetweenSum(1, 10);
//		getBetweenSum(8, 1);
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자");
		int num1 = s.nextInt();
		System.out.print("두번째 숫자");
		int num2 = s.nextInt();
		System.out.println(getBetweenSum(num1, num2));
		s.close();
		
	}

	public static int getBetweenSum(int num1, int num2) {
		int sum = 0;
		// 2번째 방법
		// int start = num1 > num2 ? num2 : num1 ;
		// int end = num1 < num2 ? num1 : num2;
		if (num1 < num2) {
			int temp = 0;
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		for (int i = num2; i <= num1; i++) {
			sum = sum + i; // sum += i
		}
		return sum;
	}
}
