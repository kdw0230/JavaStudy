package ch04;

public class Exam4_7 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int space = 5 - i; // 1 ¹ø
//			int space = i - 1; // 2 ¹ø 
			for (int j = 1; j <= 5; j++) {
				if (j <= space) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}
