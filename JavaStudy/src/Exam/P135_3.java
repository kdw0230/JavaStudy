package Exam;

import java.util.Scanner;

public class P135_3 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int ba = 0;
		Scanner s = new Scanner(System.in);
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("-----------------------");
			System.out.print("선택> ");
			int ch = s.nextInt();
			if(ch==1) {
				System.out.print("예금액> ");
				balance = s.nextInt();
			}
			else if(ch==2) {
				System.out.print("출금액> ");
				ba = s.nextInt();
			}
			else if(ch==3) {
				int ch3 = balance - ba;
				System.out.print("잔고> " + ch3 );
				System.out.println();
			}
			else if(ch==4) {
				System.out.println();
				break;
			}
			else {
				
			}
		}
		s.close();
		System.out.println("프로그램종료");
	}
}
