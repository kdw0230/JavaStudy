package ch06;

import java.util.Scanner;

public class MethodExam1 {
	public static void main(String[] args) {
		
//		Scanner s = null;
//		s.hasNext();
		
		//스태틱키워드 미사용시(정상적인 인스턴스 사용)
		MethodExam1 me = new MethodExam1();
		me.printStar(5, '#');
		
		printStar(5, '★');
		
		//printStar(5, '★');

	}

	public static void printStar(int count, char ch) {
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);

			}
			System.out.println();
		}
	}

}
