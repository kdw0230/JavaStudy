package ch04;

import java.util.Scanner;

public class Exam4_8_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하시오. = > ");
		int num1 = s.nextInt();
		int count = 0;
		int count2 = 0;
		
		for (int i = 1; i <= num1; i++) {
			int num = i;
			int n = i;
			//int num4 = i;
			while (num > 0) {
				int num2 = num % 10;
				if (num2 == 8) {
					count++;
					//System.out.print(num + " ");
				}
				
				num = num / 10;
			}
			if (n % 4 == 0) {
					count2++;
					//System.out.print(num + " ");
				}
//			if (num % 10 == 8) {
//				count++;
//				System.out.print(num + " ");
//				
//			}
		}
		System.out.println();
		System.out.println("8의 개수 : " + count);
		
//		for (int i = 1; i <= num1; i++) {
//			int num = i;
//			// int n1 = num % 4;
//			if (num % 4 == 0) {
//				count2++;
//				//System.out.print(num + " ");
//			}
//		}
		System.out.println();
		System.out.println("4의 배수의 개수 : " + count2);
		

	}
}
