package ch12;

import java.util.Scanner;

public class Pw {
	public static void main(String[] args) {
//		String pw = "Pass12!@";
		Scanner s = new Scanner(System.in);
		System.out.println("��й�ȣ�Է�");
		String pw = null;
		while (true) {
			pw = s.next();
			boolean upper = false; // �빮�� Ȯ�� ����
			boolean lower = false; // �ҹ��� Ȯ�� ����
			boolean num = false; // ���� Ȯ�� ����
			for (int i = 0; i < pw.length(); i++) {
				char type = pw.charAt(i);
				if (type >= 65 && type <= 90) {
					upper = true;
				} else if (type >= 97 && type <= 122) {
					lower = true;
				} else if (type >= 48 && type <= 57) {
					num = true;
				}
			}
			if (upper && lower && num) {
				System.out.println("ȸ������");
				break;
			} else {
				System.out.println("�ٽ��Է����ּ���");
			}

		}
		s.close();

//		for(int i = 0 ; i< pw.length() ; i++) {
//			char ch = pw.charAt(i);
//			if(ch >= 65 && ch <= 90) {//�빮��
//				upper = true;
//			}else if (ch >=97 && ch<=122) {//�ҹ���
//				lower = true;
//			}else if(ch >= 48 && ch <= 57) {
//				num = true;
//			}
//		}
//		if(upper && lower && num) {
//			System.out.println("ȸ������");
//		}else {
//			System.out.println("�ٽ��Է�");
//		}
	}
}
