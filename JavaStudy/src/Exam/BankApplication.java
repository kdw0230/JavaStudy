package Exam;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.println("선택 > ");
			int a = s.nextInt();

			if (a == 1) {
				createAccount();
			} else if (a == 2) {
				accountList();
			} else if (a == 3) {
				deposit();
			} else if (a == 4) {
				withdraw();
			} else if (a == 5) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		String ano = s.next();
		System.out.print("계좌주 : ");
		String owner = s.next();
		System.out.print("초기입금액 : ");
		int balance = s.nextInt();

		Account newAccount = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}

	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (account != null) {
				System.out.print(account.getAno());
				System.out.print("    ");
				System.out.print(account.getOwner());
				System.out.print("    ");
				System.out.print(account.getBalance());
				System.out.print("    ");
				System.out.println();
			}
		}
	}

	private static void deposit() {
		System.out.println("------");
		System.out.println("예       금");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		String ano = s.next();
		System.out.print("예금액 : ");
		int m = s.nextInt();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + m);
		System.out.println("결과 : 예금이 성공되었습니다.");

	}

	private static void withdraw() {
		System.out.println("------");
		System.out.println("출       금");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		String ano = s.next();
		System.out.print("출금액 : ");
		int m = s.nextInt();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - m);
		System.out.println("결과 : 출금이 성공되었습니다.");
	}

	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if (dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}
