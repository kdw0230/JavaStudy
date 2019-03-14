package ch04;

public class Exan4_2_1 {
	public static void main(String[] args) {
		int score = 11;
		
		if(score % 6 == 0) {
			System.out.println("ÄôÂ¦");
		} else if(score % 2 == 0) {
			System.out.println("Â¦");
		} else if(score % 3 == 0) {
			System.out.println("Äô");
		} else {
			System.out.println(score);
		}
		
	}
}
