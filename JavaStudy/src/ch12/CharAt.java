package ch12;

import java.util.Scanner;

public class CharAt {
	public static void main(String[] args) {
//		String pw = "Pass12!@";
		Scanner s = new Scanner(System.in);
		System.out.println("��й�ȣ�Է�");
		String pw = s.next();
		
		boolean upper = false; //�빮�� Ȯ�� ����
		boolean lower = false; //�ҹ��� Ȯ�� ����
		boolean num	= false; //���� Ȯ�� ����
		
		for(int i = 0 ; i< pw.length() ; i++) {
			char ch = pw.charAt(i);
			if(ch >= 65 && ch <= 90) {//�빮��
				upper = true;
			}else if (ch >=97 && ch<=122) {//�ҹ���
				lower = true;
			}else if(ch >= 48 && ch <= 57) {
				num = true;
			}
		}
		if(upper && lower && num) {
			System.out.println("ȸ������");
		}else {
			System.out.println("�ٽ��Է�");
		}
	}
}
