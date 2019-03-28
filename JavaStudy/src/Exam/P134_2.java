package Exam;

public class P134_2 {
	public static void main(String[] args) {
		while (true) {
			int a1 = (int) (Math.random() * 6 + 1);
			int a2 = (int) (Math.random() * 6 + 1);
			System.out.println("(" + a1 + "," + a2 + ")");
			if (a1 + a2 == 5) {
				break;
			}
		}
	}
}
