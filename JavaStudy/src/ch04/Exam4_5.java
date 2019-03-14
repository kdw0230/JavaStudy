package ch04;

public class Exam4_5 {
	public static void main(String[] args) {
		int total = 0;
		for (int a = 1; a <= 1000; a++) {
			if (a % 2 == 0 && a % 7 == 0) {
				total = total + a;
				System.out.println(a);
			}
		}
		System.out.println("각 숫자들의 합 : " + total);
	}
}
