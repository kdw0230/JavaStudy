package ch04;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		System.out.println("가위:0,바위:1,보:2");
		Scanner s = new Scanner(System.in);
		
		boolean isContinue = true;
		while (isContinue) {
			
			System.out.print("숫자입력>>");
			int player = s.nextInt();
			int com = (int) (Math.random() * 3);

			if (player + 1 % 3 == com) {
				System.out.println("유저 짐");
			} else {
				if (player == com) {
					System.out.println("비김");
				} else {
					System.out.println("유저이김");
					isContinue = false;
				}
				
			}
		}

		s.close();

	}
}
