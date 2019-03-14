package ch04;

public class Star {
	public static void main(String[] args) {
		//피라미드 별모양
//		for (int a = 1; a <= 10; a++) {
//			for (int b = 1; b <= a; b++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		//피라미드 거꾸로
		for (int a = 10 ; a >= 1 ; a--) {
			for (int b = 1 ; b <= a; b++) {
				System.out.print("★");
			} System.out.println();
		} 

	}

}
