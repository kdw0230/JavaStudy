package ch04;

public class For1_1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
				System.out.print("i의 값 = " + i);
				System.out.println("sum의 값 = " + sum);
			}
		}
		System.out.println("최종 sum의 값 = " + sum);
	}
}
