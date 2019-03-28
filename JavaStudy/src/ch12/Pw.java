package ch12;

import java.util.Scanner;

public class Pw {
	public static void main(String[] args) {
//		String pw = "Pass12!@";
		Scanner s = new Scanner(System.in);
		System.out.println("비밀번호입력");
		String pw = null;
		while (true) {
			pw = s.next();
			boolean upper = false; // 대문자 확인 변수
			boolean lower = false; // 소문자 확인 변수
			boolean num = false; // 숫자 확인 변수
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
				System.out.println("회원가입");
				break;
			} else {
				System.out.println("다시입력해주세요");
			}

		}
		s.close();

//		for(int i = 0 ; i< pw.length() ; i++) {
//			char ch = pw.charAt(i);
//			if(ch >= 65 && ch <= 90) {//대문자
//				upper = true;
//			}else if (ch >=97 && ch<=122) {//소문자
//				lower = true;
//			}else if(ch >= 48 && ch <= 57) {
//				num = true;
//			}
//		}
//		if(upper && lower && num) {
//			System.out.println("회원가입");
//		}else {
//			System.out.println("다시입력");
//		}
	}
}
