package ch06;

import java.util.Scanner;

public class MethodExam1 {
	public static void main(String[] args) {
		
//		Scanner s = null;
//		s.hasNext();
		
		//����ƽŰ���� �̻���(�������� �ν��Ͻ� ���)
		MethodExam1 me = new MethodExam1();
		me.printStar(5, '#');
		
		printStar(5, '��');
		
		//printStar(5, '��');

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
