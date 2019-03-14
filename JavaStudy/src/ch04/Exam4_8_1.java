package ch04;

import java.util.Scanner;

public class Exam4_8_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하시오. = > ");
		int num1 = s.nextInt();
		int count = 0;
		for (int i = 1; i <= num1; i++) {
			int num = i;
			while (num > 0) {
				int num2 = num % 10;
				if (num2 == 8) {
					count++;
				}
				num = num / 10;
			}
			System.out.print(i + "");
		}
		System.out.println();
		System.out.println("8의 개수 : " + count);

	}
}
