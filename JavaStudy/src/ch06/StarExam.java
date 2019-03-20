package ch06;

public class StarExam {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= 6 - i; j++) {
				System.out.print(" 1 ");
			}
//			for (int k = 0; k <= 2 * i; k++) {
//				if (k == 0 || 2 * i == k) {
//					System.out.print("¡Ù");
//				} else
//					System.out.print("   ");
//			}
			System.out.println();

		}
	}
}
