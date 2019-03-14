package ch05;

public class Loop {
	public static void main(String[] args) {
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int[] s = {};

		for (int i = 1; i <= 3; i++) {
//			"s" + 1 = i; => X
			s[i] = i;
		}
	}
}
